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
import generated.grpc.testservice.SpeakingQuestionOrScore;
import generated.grpc.testservice.SpeakingResponse;
import generated.grpc.testservice.TestResponse;
import generated.grpc.testservice.TestServiceGrpc.TestServiceImplBase;
import generated.grpc.testservice.TestType;
import generated.grpc.testservice.WritingQuestion;
import generated.grpc.testservice.WritingQuestionOrScore;
import generated.grpc.testservice.WritingResponse;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
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

        int port = 50051;

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
         
    public int calculateScore (int testType, int testId, List<String> answer){
        int score = 0;
        switch(testType){
            case 0 :
                ReadingTest Rtest = new ReadingTest();
                ReadingExercise Rexercise = Rtest.getMapTest().get(testId);
                List<ReadingQ>  Rquestions = Rexercise.getQuestions();
                System.out.println(Rquestions.size());
                System.out.println(answer.size());
                for (int i = 0; i< answer.size();i++){
                    if(Rquestions.get(i).checkAnswer(answer.get(i).toLowerCase().trim())){
                        score = score + Rquestions.get(i).getMaxScore();
                    } else {
                        score = score + 0;
                    }
                }
                break;
            case 1: 
                ListeningTest Ltest = new ListeningTest();
                ListeningExercise Lexercise = Ltest.getMapTest().get(testId);
                List<ListeningQ> Lquestions = Lexercise.getQuestions();
                for (int i = 0; i< Lquestions.size();i++){
                    if(Lquestions.get(i).checkAnswer(answer.get(i).toLowerCase().trim())){
                        score = score + Lquestions.get(i).getMaxScore();
                    } else {
                        score = score + 0;
                    }
                }
                break;
            case 3: 
                WritingTest Wtest = new WritingTest();
                List<WritingQ> Wquestions = Wtest.getMapQuestion().get(testId);
                for (int i = 0; i< Wquestions.size();i++){
                    if(answer.get(i) != null){
                        score = score + Wquestions.get(i).getMaxScore();
                    } else {
                        score = score + 0;
                    }
                }
                break;
            }
        return score;
    }
    
    /**
     * Unary
     * getTest(TestType) returns (TestResponse) {}
     */
    
    @Override
    public void getTest(TestType request, StreamObserver<TestResponse> response) {
        System.out.println("Receiving test type: " + request.getTestType() + ". Prepare the test, please wait a few minutes");
//        switch (request.getTestType()){
//            case LISTENING:
//                TestResponse Tresponse = TestResponse.newBuilder()
//                                        .setMessage("Starting Listening Test... Use getListeningTest()")
//                                        .build();
//                response.onNext(Tresponse);
//                response.onCompleted();
//                // Call getListeningTest()
//                getListeningTest(responseObserver);



		
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
        Iterator<ListeningQ> questionIterator = questions.iterator();
        // Send sound path
        responseObserver.onNext(
            ListeningQuestionOrScore.newBuilder()
                .setSoundpath(ListeningSound.newBuilder()
                        .setSoundpath(exercise.getAudioPath())
                        .build())
                .build()
        );
        
        return new StreamObserver<ListeningResponse> () {
            private int index = 0;
            private final List<String> answers = new ArrayList<>();

            @Override
            public void onNext(ListeningResponse answer) {
                System.out.println("Received answer: " + answer.getAnswer());
                answers.add(answer.getAnswer());
                if (questionIterator.hasNext()) {
                    ListeningQ currentQ = questionIterator.next();
                    ListeningQuestion question = ListeningQuestion.newBuilder()
                            .setQuestion(currentQ.getFullSentence())
                            .setMaxScore(currentQ.getMaxScore())
                            .setQuestionId(currentQ.getQuestionID())
                            .build();
                    responseObserver.onNext(ListeningQuestionOrScore.newBuilder().setQuestion(question).build());
                } else {
                    System.out.println("Listening Test Completed. Calculating Score...");
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

    
//    /** 
//     * Bi-directional streaming operation
//     * getSpeakingTest (stream SpeakingResponse) returns (stream SpeakingQuestionOrScore) {}
//     */
//    public StreamObserver<SpeakingResponse> getSpeakingTest(StreamObserver<SpeakingQuestionOrScore> responseObserver) {
//        SpeakingTest test = new SpeakingTest();
//        int testID = test.getRandomTestId();
//        SpeakingExecise exercise = test.getMapTest().get(testID);
//        List<SpeakingQ> questions = exercise.getQuestions();
//        Iterator<SpeakingQ> questionIterator = questions.iterator();
//    }
    
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
    if (!questions.isEmpty()) {
        responseObserver.onNext(ReadingQuestionOrScore.newBuilder()
            .setQuestion(ReadingQuestion.newBuilder()
                .setQuestion(questions.get(0).getFullQuestion())
                .build())
            .build());
    }

//    Thread questionThread = new Thread(() -> {
//        try {
//            int nextIdx = currentQuestion.incrementAndGet();
//            if (nextIdx < questions.size()){
//                ReadingQ currentQ = questions.get(nextIdx);
//                System.out.println("SERVER: Sending question " + (i + 1));
//
//                // send question
//                ReadingQuestion question = ReadingQuestion.newBuilder()
//                        .setQuestion(currentQ.getFullQuestion())
//                        .build();
//                responseObserver.onNext(
//                        ReadingQuestionOrScore.newBuilder()
//                                .setQuestion(question)
//                                .build()
//                );
//
//                // sleep 30 seconds between each question
//                Thread.sleep(2000);
//            }
//
////            // Sau khi gửi hết câu hỏi, tính điểm và gửi điểm
////            double avgScore = calculateScore(0, testID, answers);
////            responseObserver.onNext(
////                ReadingQuestionOrScore.newBuilder()
////                        .setFinalScore(AverageScore.newBuilder()
////                                .setAverageScore(avgScore)
////                                .build())
////                        .build()
////            );
////            responseObserver.onCompleted();
//            System.out.println("SERVER: All questions sent");
//
//        } catch (InterruptedException e) {
//            System.err.println("SERVER: Error sending questions: " + e.getMessage());
//            responseObserver.onError(e);
//        }
//    });
//
//    // Bắt đầu Thread
//    questionThread.start();
//

    return new StreamObserver<ReadingResponse>() {
        
        @Override
        public void onNext(ReadingResponse answer) {
            int count = 0;
            System.out.println("SERVER: Received answer: " + answer.getAnswer());
            answers.add(answer.getAnswer());
//            if (answers.size() == questions.size()) {
//                double avgScore = calculateScore(0, testID, answers);
//                responseObserver.onNext(
//                        ReadingQuestionOrScore.newBuilder()
//                                .setFinalScore(AverageScore.newBuilder()
//                                        .setAverageScore(avgScore)
//                                        .build())
//                                .build()
//                );
//                responseObserver.onCompleted();
//            }
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
//            questionTask.cancel(true);
//            scheduler.shutdownNow();
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
//            scheduler.shutdown();
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
        Iterator<WritingQ> questionIterator = questions.iterator();
        
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
                if (questionIterator.hasNext()) {
                    WritingQ currentQ = questionIterator.next();
                    WritingQuestion question = WritingQuestion.newBuilder()
                            .setQuestion(currentQ.getFullQuestion())
                            .setMaxScore(currentQ.getMaxScore())
                            .setQuestionId(currentQ.getQuestionID())
                            .build();
                    responseObserver.onNext(WritingQuestionOrScore.newBuilder().setQuestion(question).build());
                } else {
                    System.out.println("Writing Test Completed. Calculating Score...");
                    
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
