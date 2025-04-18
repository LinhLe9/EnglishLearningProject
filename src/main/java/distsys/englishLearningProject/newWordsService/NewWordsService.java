/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.newWordsService;
import com.google.protobuf.ByteString;
import generated.grpc.newwordsservice.WordDetail;
import generated.grpc.newwordsservice.Word;
import generated.grpc.newwordsservice.Topic;
import generated.grpc.newwordsservice.WordList;

import generated.grpc.newwordsservice.NewWordsServiceGrpc.NewWordsServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.*;
import java.util.logging.Logger;
/**
 *
 * @author DELL
 */
public class NewWordsService extends NewWordsServiceImplBase {
    private static final Logger logger = Logger.getLogger(NewWordsService.class.getName());

    public static void main(String[] args) {

        NewWordsService newWordServer = new NewWordsService();

        int port = 50052;

        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(newWordServer)
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
    /**
     * UNARY 
     * WordDefinition(Word) returns (WordDetail) {}
     *
     * @param request
     * @param response
     */
    
    @Override
    public void wordDefinition(Word request, StreamObserver<WordDetail> response) {
        WordDictionary myW = new WordDictionary();
        // gets all the temperatures recorded for the location and returns the first one on the list
        WordInfo result = myW.getDetail(request.getWord());
        WordDetail detail = WordDetail.newBuilder().setDefinition(result.getDefinition())
                            .setPronunciation(result.getPronunciation())
                            .setExample(result.getExample())
                            .build();
        response.onNext(detail);
        response.onCompleted();
    }
    
    /**
     * SERVER STREAMING 
     * rpc WordsByTopic(Topic) returns (stream WordList) {}
     */
    @Override
    public void wordsByTopic(Topic request, StreamObserver<WordList> response) {
       WordListByTopic wlbt = new WordListByTopic();
       List<WordInfoByTopic> wordResponse = wlbt.getWordByTopic(request.getTopic());
       Iterator<WordInfoByTopic> i = wordResponse.iterator();
       while (i.hasNext()) {
            WordInfoByTopic value = i.next();
            WordList word = WordList.newBuilder().setDefinition(value.getDefinition())
                            .setPronunciation(value.getPronunciation())
                            .setWord(value.getWord())
                            .build();
            response.onNext(word);
        }
        response.onCompleted();
    }
    
    /** Server stream 
     * rpc TopicRequest () returns (stream Topic){}
     */
    @Override
    public void topicRequest (com.google.protobuf.Empty request, StreamObserver<Topic> response){
        WordListByTopic wlbt = new WordListByTopic();
        List<String> topic = wlbt.getAllTopics();
        Iterator<String> i = topic.iterator();
        while (i.hasNext()) {
            String value = i.next();
            Topic myT = Topic.newBuilder().setTopic(value).build();
            response.onNext(myT);
        }
        response.onCompleted();
    }
}
