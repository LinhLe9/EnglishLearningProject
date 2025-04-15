/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.scoreCalculateService;

import generated.grpc.scorecalculateservice.ConvertedScore;
import generated.grpc.scorecalculateservice.FinalScore;
import generated.grpc.scorecalculateservice.IeltsScore;
import generated.grpc.scorecalculateservice.ScoreCalculateServiceGrpc;
import generated.grpc.scorecalculateservice.ScoreCalculateServiceGrpc.ScoreCalculateServiceBlockingStub;
import generated.grpc.scorecalculateservice.ScoreCalculateServiceGrpc.ScoreCalculateServiceStub;
import generated.grpc.scorecalculateservice.SkillScore;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DELL
 */
public class ScoreCalculateClient {
    private static ScoreCalculateServiceBlockingStub blockingStub;
    private static ScoreCalculateServiceStub asyncStub;
    ManagedChannel channel;
    
    public ScoreCalculateClient() {
        channel = ManagedChannelBuilder
                .forAddress("localhost", 50050)
                .usePlaintext()
                .build();

        blockingStub = ScoreCalculateServiceGrpc.newBlockingStub(channel);

        asyncStub = ScoreCalculateServiceGrpc.newStub(channel);
    }
    
    /*
    * Server streaming
    * rpc convertToOtherScores(IeltsScore) returns (stream ConvertedScore);
    * user enter an Ielts Score, server return a stream of coverted score
    */
    public Iterator<ConvertedScore> convertToOtherScores(Double iScore){
        IeltsScore request = IeltsScore.newBuilder().setOverallBand(iScore.doubleValue()).build();
        Iterator<ConvertedScore> responses = null;
        try {

            // the blocking stub means that the iterator only returns to the client 
            // after the server has performed onComplete();
            // the client gets the response directly like a local method call
            // the client accesses the responses iterator  and loops through it
            responses = blockingStub.convertToOtherScores(request);
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
        return responses;
    }
    
    /*
    * Client Streaming
    * rpc calculateAverageScore(stream SkillScore) returns (FinalScore);
    * user enter a stream of score 
    */
    
    public StreamObserver<SkillScore> calculateAverageScore(StreamObserver<FinalScore> responseObserver) {

	StreamObserver<SkillScore> requestObserver = asyncStub.calculateAverageScore(responseObserver);
        return requestObserver;
    }

    public static void main(String[] args) {

        ScoreCalculateClient mathClient = new ScoreCalculateClient();
        Double op1 = Double.valueOf(6.0);
        
        Iterator<ConvertedScore> cs = mathClient.convertToOtherScores(op1);
        if (cs != null) {
            while (cs.hasNext()) {
                ConvertedScore score = cs.next();
                System.out.println("Converted to: " + score.getCertificateName() +
                               " - " + score.getEquivalentScore());
            }
        } else {
            System.err.println("Failed to get converted scores.");
            return;
        }
        // mathClient.averageValues();
        //mathClient.convertBase(); 
        
        StreamObserver<FinalScore> responseObserver = new  StreamObserver<FinalScore>(){
                @Override
              public void onNext(FinalScore value) {
                  System.out.println("Average score: " + value.getAverageScore());
              }

              @Override
              public void onError(Throwable t) {
                  t.printStackTrace();
              }

              @Override
              public void onCompleted() {
                  System.out.println("Finished receiving final score.");
              }
          };
        StreamObserver<SkillScore> requestObserver = mathClient.calculateAverageScore(responseObserver);
        try {
            requestObserver.onNext(SkillScore.newBuilder().setScore(6.5).build());
            requestObserver.onNext(SkillScore.newBuilder().setScore(7.0).build());
            requestObserver.onNext(SkillScore.newBuilder().setScore(6.0).build());

            requestObserver.onCompleted(); // Important!

            // Sleep briefly to wait for async response
            Thread.sleep(1000);
        } catch (RuntimeException | InterruptedException e) {
            e.printStackTrace();
        }

    }
    
}
