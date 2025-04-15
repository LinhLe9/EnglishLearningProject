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
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();
        asyncStub = TestServiceGrpc.newStub(channel);
        syncStub = TestServiceGrpc.newBlockingStub(channel);  
    }
    
    //StreamObserver<ListeningResponse>
    public StreamObserver<ListeningResponse> getListeningTest(StreamObserver<ListeningQuestionOrScore> responseObserver) {
    
    StreamObserver<ListeningResponse> requestLObserver = asyncStub.getListeningTest(
        new StreamObserver<ListeningQuestionOrScore>() {
            @Override
            /**
            * NOTE that in client streaming we expect only one response from the server.So we should see
            * this message only once. We could add some error handling in here to prevent the client from processing
            * more than one reply from the server
            */
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

    // Giữ lại requestObserver để gửi dữ liệu từ client
    final StreamObserver<ReadingResponse>[] requestObserverHolder = new StreamObserver[1];

    // Observer nhận phản hồi từ server (gửi câu hỏi hoặc điểm)
    StreamObserver<ReadingQuestionOrScore> responseObserver = new StreamObserver<ReadingQuestionOrScore>() {
        @Override
        public void onNext(ReadingQuestionOrScore value) {
            // Giả sử server gửi ReadingQuestion (nếu gửi điểm thì cần check thêm)
            if (value.hasQuestion()) {
                ReadingQuestion question = value.getQuestion();
                System.out.println("📘 Question: " + question);
                System.out.print("✏️  Your answer (type 'exit' to finish): ");
                String answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("exit")) {
                    // Gửi tín hiệu kết thúc tới server
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

    // Khởi động stream
    StreamObserver<ReadingResponse> requestObserver = client.getReadingTest(responseObserver);
    requestObserverHolder[0] = requestObserver;

    // Mọi input được xử lý trong responseObserver.onNext()
}
    
}
