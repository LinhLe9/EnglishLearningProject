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

    }
    
    /**
     * UNARY: for a specific location get the temperature right now rpc
     * CurrentTemperature(Location) returns (Temperature) {}
     */
    private static void getWordDefination() {
        System.out.println("Unary - getCurrentTemperature ");
        Word request = Word.newBuilder().setWord("abbacy").build();
        WordDetail response = syncStub.wordDefinition(request);
        System.out.println("Client received " + response.toString()+ "for Cafeteria");

    }

}
