/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.testService;
import generated.grpc.testservice.AverageScore;
import generated.grpc.testservice.ListeningQuestion;
import generated.grpc.testservice.ListeningQuestionOrScore;
import generated.grpc.testservice.ListeningResponse;
import generated.grpc.testservice.ReadingPassage;
import generated.grpc.testservice.ReadingQuestion;
import generated.grpc.testservice.ReadingQuestionOrScore;
import generated.grpc.testservice.ReadingResponse;
import generated.grpc.testservice.SpeakingQuestionOrScore;
import generated.grpc.testservice.SpeakingResponse;
import generated.grpc.testservice.TestServiceGrpc;
import generated.grpc.testservice.TestServiceGrpc.TestServiceBlockingStub;
import generated.grpc.testservice.TestServiceGrpc.TestServiceStub;
import generated.grpc.testservice.WritingQuestionOrScore;
import generated.grpc.testservice.WritingResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author DELL
 */
public class TestClient {
    // a non-blocking stub to make an asynchronous call
    private TestServiceStub asyncStub;
    // a blocking stub to make synchronout calls
    private TestServiceBlockingStub syncStub;
    // channel 
    ManagedChannel channel;

    // constructor
    public TestClient (){
        channel = ManagedChannelBuilder
                .forAddress("localhost", 50055)
                .usePlaintext()
                .build();
        asyncStub = TestServiceGrpc.newStub(channel);
        syncStub = TestServiceGrpc.newBlockingStub(channel);  
    }
    
    //Speaking
    public StreamObserver<SpeakingResponse> getSpeakingTest(StreamObserver<SpeakingQuestionOrScore> responseObserver) {
    
    StreamObserver<SpeakingResponse> requestSObserver = asyncStub.getSpeakingTest(
        new StreamObserver<SpeakingQuestionOrScore>() {
            @Override
            public void onNext(SpeakingQuestionOrScore response) {
                System.out.println("DEBUG - Client received: " + response);
                responseObserver.onNext(response);
                
            }

            @Override
            public void onError(Throwable t) {
		t.printStackTrace();
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
		System.out.println("DEBUG - Client stream completed");
                responseObserver.onCompleted();
            }
        });  
        return requestSObserver;
    }
    
    //StreamObserver<ListeningResponse>
    public StreamObserver<ListeningResponse> getListeningTest(StreamObserver<ListeningQuestionOrScore> responseObserver) {
    
    StreamObserver<ListeningResponse> requestLObserver = asyncStub.getListeningTest(
        new StreamObserver<ListeningQuestionOrScore>() {
            @Override
            public void onNext(ListeningQuestionOrScore response) {
                System.out.println("DEBUG - Client received: " + response);
                responseObserver.onNext(response);
                
            }

            @Override
            public void onError(Throwable t) {
		t.printStackTrace();
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
		System.out.println("DEBUG - Client stream completed");
                responseObserver.onCompleted();
            }
        });  
        return requestLObserver;
    }
    
    // Reading test 
    public StreamObserver<ReadingResponse> getReadingTest(StreamObserver<ReadingQuestionOrScore> responseObserver) {
    System.out.println("DEBUG - Initializing reading test stream");
    
    StreamObserver<ReadingResponse> requestObserver = asyncStub.getReadingTest(
        new StreamObserver<ReadingQuestionOrScore>() {
            @Override
            public void onNext(ReadingQuestionOrScore response) {
                System.out.println("DEBUG - Client received: " + response);
                responseObserver.onNext(response); // Forward to GUI
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("DEBUG - Client error: " + t.getMessage());
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                System.out.println("DEBUG - Client stream completed");
                responseObserver.onCompleted();
            }
        });
    
        return requestObserver;
    }
    
    
    // Writing test 
    public StreamObserver<WritingResponse> getWritingTest(StreamObserver<WritingQuestionOrScore> responseObserver) {
    System.out.println("DEBUG - Initializing reading test stream");
    
    StreamObserver<WritingResponse> requestObserver = asyncStub.getWritingTest(
        new StreamObserver<WritingQuestionOrScore>() {
            @Override
            public void onNext(WritingQuestionOrScore response) {
                System.out.println("DEBUG - Client received: " + response);
                responseObserver.onNext(response); // Forward to GUI
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("DEBUG - Client error: " + t.getMessage());
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                System.out.println("DEBUG - Client stream completed");
                responseObserver.onCompleted();
            }
        });
    
    return requestObserver;
    }    
    
    public static void main(String[] args) {
    TestClient client = new TestClient();
    Scanner scanner = new Scanner(System.in);
    
    final StreamObserver<ReadingResponse>[] requestObserverHolder = new StreamObserver[1];

    StreamObserver<ReadingQuestionOrScore> responseObserver = new StreamObserver<ReadingQuestionOrScore>() {
        @Override
        public void onNext(ReadingQuestionOrScore value) {
            if (value.hasQuestion()) {
                ReadingQuestion question = value.getQuestion();
                System.out.println("📘 Question: " + question);
                System.out.print("✏️  Your answer (type 'exit' to finish): ");
                String answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("exit")) {
                    requestObserverHolder[0].onCompleted();
                    return;
                }

                ReadingResponse response = ReadingResponse.newBuilder()
                        .setAnswer(answer)
                        .build();

                requestObserverHolder[0].onNext(response);
            } else if (value.hasFinalScore()) {
                System.out.println("✅ Final Score: " + value.getFinalScore());
            }
        }

        @Override
        public void onError(Throwable t) {
            System.err.println("❌ Error from server: " + t.getMessage());
        }

        @Override
        public void onCompleted() {
            System.out.println("✅ Server stream completed.");
        }
    };

    StreamObserver<ReadingResponse> requestObserver = client.getReadingTest(responseObserver);
    requestObserverHolder[0] = requestObserver;
}
    
}
