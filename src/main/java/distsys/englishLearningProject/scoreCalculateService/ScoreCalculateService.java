/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject.scoreCalculateService;

import generated.grpc.scorecalculateservice.ConvertedScore;
import generated.grpc.scorecalculateservice.FinalScore;
import generated.grpc.scorecalculateservice.IeltsScore;
import generated.grpc.scorecalculateservice.ScoreCalculateServiceGrpc;
import generated.grpc.scorecalculateservice.ScoreCalculateServiceGrpc.ScoreCalculateServiceImplBase;
import generated.grpc.scorecalculateservice.SkillScore;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class ScoreCalculateService extends ScoreCalculateServiceImplBase {
    private static final Logger logger = Logger.getLogger(ScoreCalculateService.class.getName());

    public static void main(String[] args) {

        ScoreCalculateService testServer = new ScoreCalculateService();

        int port = 50050;

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
    
    /**
     * Client Streaming
     * rpc calculateAverageScore(stream SkillScore) returns (FinalScore);
     */
    
    @Override
    public StreamObserver<SkillScore> calculateAverageScore(StreamObserver<FinalScore> response) {
        return new StreamObserver<SkillScore>() {
            // the observer will collect each number that arrives from the client into this ArrayList
            ArrayList<Double> list = new ArrayList();

            @Override
            // when a new number arrives , put it into the array
            public void onNext(SkillScore request) {
                System.out.println(LocalTime.now().toString()+ ": received a Skill Score: "+ request.getScore());
                    list.add(request.getScore());		           
            }

            @Override

            public void onError(Throwable t) {
                System.err.println("SERVER: Error occurred: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.printf(LocalTime.now().toString() + ": Skill Score stream complete \n" );

                double temp = 0;	
                for(double v:  list) {
                    temp = temp + v;
                    System.out.println("value:" + v);
                }
                double mean = (double) (temp/list.size());
                double roundMean = Math.round(mean * 2) / 2;

                FinalScore reply = FinalScore.newBuilder().setAverageScore(roundMean).build();

                response.onNext(reply);

                response.onCompleted();

            }
        };
    }
    
    /**
     * Server Streaming
     * rpc convertToOtherScores(IeltsScore) returns (stream ConvertedScore);
     */
    
    @Override
    public void convertToOtherScores(IeltsScore request, StreamObserver<ConvertedScore> response) {
       IeltsConvert ic = new IeltsConvert();
       List<englishCerScore> scoreList = ic.getAllConvertScore(request.getOverallBand());
       Iterator<englishCerScore> i = scoreList.iterator();
       while (i.hasNext()) {
            englishCerScore value = i.next();
            ConvertedScore score = ConvertedScore.newBuilder().setCertificateName(value.getName())
                                    .setEquivalentScore(value.getEqualScore())
                                    .build();
            response.onNext(score);
        }
        response.onCompleted();
    }
    
}
