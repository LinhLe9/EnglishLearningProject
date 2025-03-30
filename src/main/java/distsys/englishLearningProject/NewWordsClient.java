/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject;
import generated.grpc.newwordsservice.WordDetail;
import generated.grpc.newwordsservice.Word;
import generated.grpc.newwordsservice.NewWordsServiceGrpc;
import generated.grpc.newwordsservice.NewWordsServiceGrpc.NewWordsServiceBlockingStub;
import generated.grpc.newwordsservice.NewWordsServiceGrpc.NewWordsServiceStub;
import generated.grpc.newwordsservice.Topic;
import generated.grpc.newwordsservice.WordList;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.time.LocalTime;
import java.util.Iterator;

/**
 *
 * @author DELL
 */
public class NewWordsClient {
    // a non-blocking stub to make an asynchronous call
    //
    private static NewWordsServiceStub asyncStub;

    // a blocking stub to make synchronout calls
    private static NewWordsServiceBlockingStub syncStub;

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        //non-blocking stub is for asynchronous calls
        //client does not wait for server to complete before starting to read responses
        //must use non-blocking stub for client streaming and bidirectional streaming
        //can also use for Server Streaming asynchronously 
        asyncStub = NewWordsServiceGrpc.newStub(channel);
        syncStub = NewWordsServiceGrpc.newBlockingStub(channel);
        
        try {
                    System.out.println("Unary Streaming");
                    getWordDefinition();
                    Thread.sleep(500);
                    
                    System.out.println("Server Streaming");
                    getWordsByTopic();
                    Thread.sleep(1000);
                } catch (RuntimeException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {			
                    e.printStackTrace();
                }
                

    }
    
    /**
     * UNARY: for a specific location get the temperature right now rpc
     */
    private static void getWordDefinition() {
        System.out.println("Unary - getCurrentTemperature ");
        Word request = Word.newBuilder()
                        .setWord("abbacy")
                        .build();
        System.out.println(LocalTime.now().toString() + ": Sending request for " + request);
        
        // sent it to server
        WordDetail response = syncStub.wordDefinition(request);
        System.out.println("Client received: " + "\n"
                            + request + "/" + response.getPronunciation() +"/: "
                            + response.getDefinition() + "\n"
                            + response.getExample());
        try {
            Thread.sleep(10000); // Wait for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    
    private static void getWordsByTopic() {
        System.out.println("Server Streaming asyncStub - getWordsByTopic ");
        StreamObserver<WordList> responseObserver = new StreamObserver<WordList>() {
            @Override
            public void onNext(WordList response) {
		System.out.println(LocalTime.now().toString() + ": response from server " + "\n" 
                                    + response.getWord() + " " 
                                    + response.getPronunciation() + "\n"
                                    + response.getDefinition()
                                    + "\n");
            }
            
            @Override
            public void onError(Throwable t) {
		t.printStackTrace();
            }

            @Override
            public void onCompleted() {
		System.out.println(LocalTime.now().toString() + ": stream is completed.");
            }

	};
        
        Topic topicRequest = Topic.newBuilder().setTopic("Food").build();
        asyncStub.wordsByTopic(topicRequest, responseObserver);
//        Iterator<WordList> theWord = syncStub.wordsByTopic(topicRequest);
//        while (theWord.hasNext()) {
//          WordList response = theWord.next();
//          System.out.println("client received " + response.toString());

//        }

    }
    
}
