/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.newWordsService;
import generated.grpc.newwordsservice.WordDetail;
import generated.grpc.newwordsservice.Word;
import generated.grpc.newwordsservice.NewWordsServiceGrpc;
import generated.grpc.newwordsservice.NewWordsServiceGrpc.NewWordsServiceBlockingStub;
import generated.grpc.newwordsservice.NewWordsServiceGrpc.NewWordsServiceStub;
import generated.grpc.newwordsservice.Topic;
import generated.grpc.newwordsservice.WordList;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author DELL
 */
public class NewWordsClient {
    // a non-blocking stub to make an asynchronous call
    //
    private NewWordsServiceStub asyncStub;

    // a blocking stub to make synchronout calls
    private NewWordsServiceBlockingStub syncStub;
    
    // channel 
    ManagedChannel channel;

    public NewWordsClient (){
        channel = ManagedChannelBuilder
                .forAddress("localhost", 50052)
                .usePlaintext()
                .build();
        asyncStub = NewWordsServiceGrpc.newStub(channel);
        syncStub = NewWordsServiceGrpc.newBlockingStub(channel);
        
    }
    
    /**
     * UNARY: for a specific location get the temperature right now rpc
     */
    public WordDetail getWordDefinition(String wordSearch) {
        System.out.println("Unary - getWordDefinition ");
        Word request = Word.newBuilder()
                        .setWord(wordSearch)
                        .build();
        System.out.println(LocalTime.now().toString() + ": Sending request for " + request);
        
        // sent it to server
        WordDetail response = syncStub.wordDefinition(request);
        System.out.println("Client received: " + "\n"
                            + request + "/" + response.getPronunciation() +"/: "
                            + response.getDefinition() + "\n"
                            + response.getExample());
        try {
            Thread.sleep(10); // Wait for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return response;
    }
    
    
    public Iterator<WordList> getWordsByTopic(String topicR) {
        System.out.println("Server Streaming syncStub - getWordsByTopic ");
        Iterator<WordList> responses = null;
        
        try{
            Topic topicRequest = Topic.newBuilder().setTopic(topicR).build();
            responses = syncStub.wordsByTopic(topicRequest);
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
        return responses;
    }
    
    /**
     * SERVER STREAMING: get all the available topics in the class
     */ 
    public List<String> getTopicRequest() {
        System.out.println("Server Streaming asyncStub - getTopicRequest ");
        Iterator<Topic> responses = null;

        try {
            responses = syncStub.topicRequest(com.google.protobuf.Empty.newBuilder().build());

        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
        List<String> myT = new ArrayList<>();
        while (responses.hasNext()) {
            Topic value = responses.next();
            String topicValue = value.getTopic();
            myT.add(topicValue);
        }
        return myT;
    }
}
