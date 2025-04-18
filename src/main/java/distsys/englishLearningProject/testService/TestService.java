/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.testService;
import generated.grpc.testservice.AverageScore;
import generated.grpc.testservice.ListeningQuestion;
import generated.grpc.testservice.ListeningQuestionOrScore;
import generated.grpc.testservice.ListeningResponse;
import generated.grpc.testservice.ListeningSound;
import generated.grpc.testservice.ReadingPassage;
import generated.grpc.testservice.ReadingQuestion;
import generated.grpc.testservice.ReadingQuestionOrScore;
import generated.grpc.testservice.ReadingResponse;
import generated.grpc.testservice.SpeakingQuestion;
import generated.grpc.testservice.SpeakingQuestionOrScore;
import generated.grpc.testservice.SpeakingResponse;
import generated.grpc.testservice.TestServiceGrpc.TestServiceImplBase;
import generated.grpc.testservice.WritingQuestion;
import generated.grpc.testservice.WritingQuestionOrScore;
import generated.grpc.testservice.WritingResponse;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
/**
 *
 * @author DELL
 */
public class TestService extends TestServiceImplBase {
    private static final Logger logger = Logger.getLogger(TestService.class.getName());

    public static void main(String[] args) {

        TestService testServer = new TestService();

        int port = 50055;

        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(testServer)
                    .build()
                    .start();
            logger.info("Server started, listening on " + port);
            System.out.println("***** Server started, listening on " + port);
            server.awaitTermination();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    // HELPER METHOD USED FOR OTHER METHOD CALLED WHEN THE STREAM COMPLETED
    // TO CALCULATE THE FINAL SCORE
    public int calculateScore (int testType, int testId, List<String> answer){
        int score = 0;
        switch(testType){
            // reading 
            case 0 : {
                ReadingTest Rtest = new ReadingTest();
                ReadingExercise Rexercise = Rtest.getMapTest().get(testId);
                List<ReadingQ>  Rquestions = Rexercise.getQuestions();
                System.out.println(Rquestions.size());
                System.out.println(answer.size());
                for (int i = 0; i< answer.size();i++){
                    String answer_string = (String) answer.get(i);
                    if(Rquestions.get(i).checkAnswer(answer_string.toLowerCase().trim())){
                        score = score + Rquestions.get(i).getMaxScore();
                    } 
                }
                break;
            }
            
            // listening
            case 1: {
                ListeningTest Ltest = new ListeningTest();
                ListeningExercise Lexercise = Ltest.getMapTest().get(testId);
                List<ListeningQ> Lquestions = Lexercise.getQuestions();
                for (int i = 0; i< Lquestions.size();i++){
                    String answerL_string = (String) answer.get(i);
                    if(Lquestions.get(i).checkAnswer(answerL_string.toLowerCase().trim())){
                        score = score + Lquestions.get(i).getMaxScore();
                    } 
                }
                break;
            }
            
            // writing
            case 3: {
                WritingTest Wtest = new WritingTest();
                List<WritingQ> Wquestions = Wtest.getMapQuestion().get(testId);
                for (int i = 0; i< Wquestions.size();i++){
                    if(answer.get(i).equalsIgnoreCase("")){
                        score = score + Wquestions.get(i).getMaxScore();
                    }
                }
                break;
            }
            default:
                throw new IllegalArgumentException("Invalid test type: " + testType);
        }
        return score;
    }
    
    // HELPER METHOD USED FOR SPEAKING METHOD CALLED WHEN THE STREAM COMPLETED
    // TO CALCULATE THE FINAL SCORE
    public int calculateSpeakingScore (int testId, List<byte[]> answer){
        int score = 0;
        SpeakingTest Stest = new SpeakingTest();
        SpeakingExecise Sexercise = Stest.getMapTest().get(testId);
        List<SpeakingQ> Squestions = Sexercise.getQuestions();
            for (int i = 0; i< Squestions.size();i++){
                byte[] audioData = answer.get(i);
                if(audioData != null && audioData.length > 0){
                    score = score + Squestions.get(i).getMaxScore();
                }
            }
        return score;
    }
    
    /** 
     * Bi-directional streaming operation
     * getListeningTest (stream ListeningResponse) returns (stream ListeningQuestionOrScore) {}
     */
    
    public StreamObserver<ListeningResponse> getListeningTest(StreamObserver<ListeningQuestionOrScore> responseObserver) {
        ListeningTest test = new ListeningTest();
        int testID = test.getRandomTestId();
        ListeningExercise exercise = test.getMapTest().get(testID);
        List<ListeningQ> questions = exercise.getQuestions();
        AtomicInteger currentLQuestion = new AtomicInteger(0);        
        
        // Send sound path
        responseObserver.onNext(
            ListeningQuestionOrScore.newBuilder()
                .setSoundpath(ListeningSound.newBuilder()
                        .setSoundpath(exercise.getAudioPath())
                        .build())
                .build()
        );
        
        // Send the first question
        if (!questions.isEmpty()) {
        responseObserver.onNext(ListeningQuestionOrScore.newBuilder()
            .setQuestion(ListeningQuestion.newBuilder()
                .setQuestion(questions.get(0).getFullSentence())
                .build())
            .build());
        }
        
        return new StreamObserver<ListeningResponse> () {
            private final List<String> answers = new ArrayList<>();

            @Override
            public void onNext(ListeningResponse answer) {
                System.out.println("Received answer: " + answer.getAnswer());
                answers.add(answer.getAnswer());
                
                // send questions
                int nextIdx = currentLQuestion.incrementAndGet();
                if (nextIdx < questions.size()) {
                    responseObserver.onNext(
                        ListeningQuestionOrScore.newBuilder()
                            .setQuestion(ListeningQuestion.newBuilder()
                                .setQuestion(questions.get(nextIdx).getFullSentence())
                                .build())
                            .build()
                    );
                } else {
                    System.out.println("SERVER: No more questions to send.");
                }
            }
            
            @Override
            public void onError(Throwable t) {
                System.err.println(t.getMessage());
            }
            
            @Override
            public void onCompleted() {
                System.out.println("Finish testing, total score: " + calculateScore(1, testID,answers));
                double avgScore = calculateScore(1, testID,answers);
                    responseObserver.onNext(
                    ListeningQuestionOrScore.newBuilder()
                        .setFinalScore(AverageScore.newBuilder().setAverageScore(avgScore).build())
                        .build()
                    );
                responseObserver.onCompleted();
            }
        };
    }

    
    /** 
     * Bi-directional streaming operation
     * getSpeakingTest (stream SpeakingResponse) returns (stream SpeakingQuestionOrScore) {}
     */
    public StreamObserver<SpeakingResponse> getSpeakingTest(StreamObserver<SpeakingQuestionOrScore> responseObserver) {
        final List<byte[]> answers = new ArrayList<>();        
        SpeakingTest test = new SpeakingTest();
        int testID = test.getRandomTestId();
        SpeakingExecise exercise = test.getMapTest().get(testID);
        List<SpeakingQ> questions = exercise.getQuestions();
        AtomicInteger currentSQuestion = new AtomicInteger(0); 
        
        // send the first question
        if (!questions.isEmpty()) {
        responseObserver.onNext(SpeakingQuestionOrScore.newBuilder()
            .setQuestion(SpeakingQuestion.newBuilder()
                .setQuestion(questions.get(0).getFullQuestion())
                .build())
            .build());
        }
        
        return new StreamObserver<SpeakingResponse>() {
        
        @Override
        public void onNext(SpeakingResponse answer) {
            int count = 0;
            System.out.println("SERVER: Received answer: " + answer.getAnswer());
            answers.add(answer.getAnswer().toByteArray());
            
            // send questions
            int nextIdx = currentSQuestion.incrementAndGet();
            if (nextIdx < questions.size()) {
                    responseObserver.onNext(
                        SpeakingQuestionOrScore.newBuilder()
                            .setQuestion(SpeakingQuestion.newBuilder()
                                .setQuestion(questions.get(nextIdx).getFullQuestion())
                                .build())
                            .build()
                    );
                } else {
                    System.out.println("SERVER: No more questions to send.");
                }
        }
        
        @Override
        public void onError(Throwable t) {
            System.err.println("SERVER: Error occurred: " + t.getMessage());
        }
        
        @Override
        public void onCompleted() {
            System.out.println("SERVER: Client completed stream");
            System.out.println("answers.size() = " + answers.size());
            System.out.println("questions.size() = " + questions.size());
            double avgScore = calculateSpeakingScore(testID, answers);
                responseObserver.onNext(
                        SpeakingQuestionOrScore.newBuilder()
                                .setFinalScore(AverageScore.newBuilder()
                                        .setAverageScore(avgScore)
                                        .build())
                                .build()
                );
            System.out.println("Finish testing, average score: " + avgScore);
            responseObserver.onCompleted();
        }
        };
    }
    
    
    /** 
     * Bi-directional streaming operation
     * getReadingTest (stream ReadingResponse) returns (stream ReadingQuestionOrScore) {}
     */  
    
    public StreamObserver<ReadingResponse> getReadingTest(StreamObserver<ReadingQuestionOrScore> responseObserver) {
      
    final List<String> answers = new ArrayList<>();
    ReadingTest test = new ReadingTest();
    int testID = test.getRandomTestId();
    ReadingExercise exercise = test.getMapTest().get(testID);
    List<ReadingQ> questions = exercise.getQuestions();
    AtomicInteger currentQuestion = new AtomicInteger(0);
    
    // Send passage
    responseObserver.onNext(
        ReadingQuestionOrScore.newBuilder()
            .setPassage(ReadingPassage.newBuilder()
                .setPassageId(String.valueOf(testID))
                .setContent(exercise.getPassage())
                .build())
            .build()
    );
    
    // send the first question
    if (!questions.isEmpty()) {
        responseObserver.onNext(ReadingQuestionOrScore.newBuilder()
            .setQuestion(ReadingQuestion.newBuilder()
                .setQuestion(questions.get(0).getFullQuestion())
                .build())
            .build());
    }
    return new StreamObserver<ReadingResponse>() {
        
        @Override
        public void onNext(ReadingResponse answer) {
            System.out.println("SERVER: Received answer: " + answer.getAnswer());
            answers.add(answer.getAnswer());

            // send questions
            int nextIdx = currentQuestion.incrementAndGet();
            if (nextIdx < questions.size()) {
                responseObserver.onNext(
                    ReadingQuestionOrScore.newBuilder()
                        .setQuestion(ReadingQuestion.newBuilder()
                            .setQuestion(questions.get(nextIdx).getFullQuestion())
                            .build())
                        .build()
                );
            } else {
                System.out.println("SERVER: No more questions to send.");
            }
        }
        
        @Override
        public void onError(Throwable t) {
            System.err.println("SERVER: Error occurred: " + t.getMessage());
        }
        
        @Override
        public void onCompleted() {
            System.out.println("SERVER: Client completed stream");
            System.out.println("answers.size() = " + answers.size());
            System.out.println("questions.size() = " + questions.size());
            double avgScore = calculateScore(0, testID, answers);
                responseObserver.onNext(
                        ReadingQuestionOrScore.newBuilder()
                                .setFinalScore(AverageScore.newBuilder()
                                        .setAverageScore(avgScore)
                                        .build())
                                .build()
                );
            System.out.println("Finish testing, average score: " + calculateScore(0, testID, answers));
            responseObserver.onCompleted();
        }
    };
}
    
    /** 
     * Bi-directional streaming operation
     * getWritingTest (stream WritingResponse) returns (stream WritingQuestionOrScore) {}
     */
    
    public StreamObserver<WritingResponse> getWritingTest(StreamObserver<WritingQuestionOrScore> responseObserver) {
        WritingTest test = new WritingTest();
        int testID = test.getRandomTestId();
        List<WritingQ> questions = test.getMapQuestion().get(testID);
        AtomicInteger currentWQuestion = new AtomicInteger(0);
        
        // send the first question
        if (!questions.isEmpty()) {
            responseObserver.onNext(WritingQuestionOrScore.newBuilder()
                .setQuestion(WritingQuestion.newBuilder()
                    .setQuestion(questions.get(0).getFullQuestion())
                    .build())
                .build());
        }
        return new StreamObserver<WritingResponse> () {
            private final List<String> answers = new ArrayList<>();
            
            @Override
            public void onNext(WritingResponse answer) {
                System.out.println("Received answer: " + answer.getAnswer());
                answers.add(answer.getAnswer());
                
                // send quesions
                int nextIdx = currentWQuestion.incrementAndGet();
                if (nextIdx < questions.size()) {
                    responseObserver.onNext(
                        WritingQuestionOrScore.newBuilder()
                            .setQuestion(WritingQuestion.newBuilder()
                                .setQuestion(questions.get(nextIdx).getFullQuestion())
                                .build())
                            .build()
                    );
                } else {
                    System.out.println("SERVER: No more questions to send.");
                }
            }
            
            @Override
            public void onError(Throwable t) {
                System.err.println(t.getMessage());
            }
            
            @Override
            public void onCompleted() {
                double avgScore = calculateScore(3, testID,answers);
                    responseObserver.onNext(
                    WritingQuestionOrScore.newBuilder()
                        .setFinalScore(AverageScore.newBuilder().setAverageScore(avgScore).build())
                        .build()
                    );
                System.out.println("Finish testing, average score: " + calculateScore(3, testID,answers));
                responseObserver.onCompleted();
            }
        }; 
    }
}
