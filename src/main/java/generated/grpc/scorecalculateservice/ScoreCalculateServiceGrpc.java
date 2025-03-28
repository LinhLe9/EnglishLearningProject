package generated.grpc.scorecalculateservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ScoreCalculateService.proto")
public final class ScoreCalculateServiceGrpc {

  private ScoreCalculateServiceGrpc() {}

  public static final String SERVICE_NAME = "ScoreCalculateService.ScoreCalculateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.scorecalculateservice.SkillScore,
      generated.grpc.scorecalculateservice.FinalScore> getCalculateAverageScoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "calculateAverageScore",
      requestType = generated.grpc.scorecalculateservice.SkillScore.class,
      responseType = generated.grpc.scorecalculateservice.FinalScore.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.scorecalculateservice.SkillScore,
      generated.grpc.scorecalculateservice.FinalScore> getCalculateAverageScoreMethod() {
    io.grpc.MethodDescriptor<generated.grpc.scorecalculateservice.SkillScore, generated.grpc.scorecalculateservice.FinalScore> getCalculateAverageScoreMethod;
    if ((getCalculateAverageScoreMethod = ScoreCalculateServiceGrpc.getCalculateAverageScoreMethod) == null) {
      synchronized (ScoreCalculateServiceGrpc.class) {
        if ((getCalculateAverageScoreMethod = ScoreCalculateServiceGrpc.getCalculateAverageScoreMethod) == null) {
          ScoreCalculateServiceGrpc.getCalculateAverageScoreMethod = getCalculateAverageScoreMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.scorecalculateservice.SkillScore, generated.grpc.scorecalculateservice.FinalScore>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ScoreCalculateService.ScoreCalculateService", "calculateAverageScore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.scorecalculateservice.SkillScore.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.scorecalculateservice.FinalScore.getDefaultInstance()))
                  .setSchemaDescriptor(new ScoreCalculateServiceMethodDescriptorSupplier("calculateAverageScore"))
                  .build();
          }
        }
     }
     return getCalculateAverageScoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.scorecalculateservice.IeltsScore,
      generated.grpc.scorecalculateservice.ConvertedScore> getConvertToOtherScoresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convertToOtherScores",
      requestType = generated.grpc.scorecalculateservice.IeltsScore.class,
      responseType = generated.grpc.scorecalculateservice.ConvertedScore.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.scorecalculateservice.IeltsScore,
      generated.grpc.scorecalculateservice.ConvertedScore> getConvertToOtherScoresMethod() {
    io.grpc.MethodDescriptor<generated.grpc.scorecalculateservice.IeltsScore, generated.grpc.scorecalculateservice.ConvertedScore> getConvertToOtherScoresMethod;
    if ((getConvertToOtherScoresMethod = ScoreCalculateServiceGrpc.getConvertToOtherScoresMethod) == null) {
      synchronized (ScoreCalculateServiceGrpc.class) {
        if ((getConvertToOtherScoresMethod = ScoreCalculateServiceGrpc.getConvertToOtherScoresMethod) == null) {
          ScoreCalculateServiceGrpc.getConvertToOtherScoresMethod = getConvertToOtherScoresMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.scorecalculateservice.IeltsScore, generated.grpc.scorecalculateservice.ConvertedScore>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ScoreCalculateService.ScoreCalculateService", "convertToOtherScores"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.scorecalculateservice.IeltsScore.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.scorecalculateservice.ConvertedScore.getDefaultInstance()))
                  .setSchemaDescriptor(new ScoreCalculateServiceMethodDescriptorSupplier("convertToOtherScores"))
                  .build();
          }
        }
     }
     return getConvertToOtherScoresMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScoreCalculateServiceStub newStub(io.grpc.Channel channel) {
    return new ScoreCalculateServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScoreCalculateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ScoreCalculateServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScoreCalculateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ScoreCalculateServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class ScoreCalculateServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Client sends a stream of individual SkillScore messages
     * Server calculates the average based on these individual scores and returns the final average score.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.scorecalculateservice.SkillScore> calculateAverageScore(
        io.grpc.stub.StreamObserver<generated.grpc.scorecalculateservice.FinalScore> responseObserver) {
      return asyncUnimplementedStreamingCall(getCalculateAverageScoreMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client requests to convert the IELTS score into other English Certificate scores.
     * Server returns a stream of respective scores.
     * </pre>
     */
    public void convertToOtherScores(generated.grpc.scorecalculateservice.IeltsScore request,
        io.grpc.stub.StreamObserver<generated.grpc.scorecalculateservice.ConvertedScore> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertToOtherScoresMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCalculateAverageScoreMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                generated.grpc.scorecalculateservice.SkillScore,
                generated.grpc.scorecalculateservice.FinalScore>(
                  this, METHODID_CALCULATE_AVERAGE_SCORE)))
          .addMethod(
            getConvertToOtherScoresMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                generated.grpc.scorecalculateservice.IeltsScore,
                generated.grpc.scorecalculateservice.ConvertedScore>(
                  this, METHODID_CONVERT_TO_OTHER_SCORES)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class ScoreCalculateServiceStub extends io.grpc.stub.AbstractStub<ScoreCalculateServiceStub> {
    private ScoreCalculateServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScoreCalculateServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScoreCalculateServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScoreCalculateServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client sends a stream of individual SkillScore messages
     * Server calculates the average based on these individual scores and returns the final average score.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.scorecalculateservice.SkillScore> calculateAverageScore(
        io.grpc.stub.StreamObserver<generated.grpc.scorecalculateservice.FinalScore> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCalculateAverageScoreMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Client requests to convert the IELTS score into other English Certificate scores.
     * Server returns a stream of respective scores.
     * </pre>
     */
    public void convertToOtherScores(generated.grpc.scorecalculateservice.IeltsScore request,
        io.grpc.stub.StreamObserver<generated.grpc.scorecalculateservice.ConvertedScore> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getConvertToOtherScoresMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class ScoreCalculateServiceBlockingStub extends io.grpc.stub.AbstractStub<ScoreCalculateServiceBlockingStub> {
    private ScoreCalculateServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScoreCalculateServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScoreCalculateServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScoreCalculateServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client requests to convert the IELTS score into other English Certificate scores.
     * Server returns a stream of respective scores.
     * </pre>
     */
    public java.util.Iterator<generated.grpc.scorecalculateservice.ConvertedScore> convertToOtherScores(
        generated.grpc.scorecalculateservice.IeltsScore request) {
      return blockingServerStreamingCall(
          getChannel(), getConvertToOtherScoresMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class ScoreCalculateServiceFutureStub extends io.grpc.stub.AbstractStub<ScoreCalculateServiceFutureStub> {
    private ScoreCalculateServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ScoreCalculateServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScoreCalculateServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ScoreCalculateServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CONVERT_TO_OTHER_SCORES = 0;
  private static final int METHODID_CALCULATE_AVERAGE_SCORE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ScoreCalculateServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ScoreCalculateServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT_TO_OTHER_SCORES:
          serviceImpl.convertToOtherScores((generated.grpc.scorecalculateservice.IeltsScore) request,
              (io.grpc.stub.StreamObserver<generated.grpc.scorecalculateservice.ConvertedScore>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE_AVERAGE_SCORE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.calculateAverageScore(
              (io.grpc.stub.StreamObserver<generated.grpc.scorecalculateservice.FinalScore>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ScoreCalculateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScoreCalculateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.scorecalculateservice.ScoreCalculateServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ScoreCalculateService");
    }
  }

  private static final class ScoreCalculateServiceFileDescriptorSupplier
      extends ScoreCalculateServiceBaseDescriptorSupplier {
    ScoreCalculateServiceFileDescriptorSupplier() {}
  }

  private static final class ScoreCalculateServiceMethodDescriptorSupplier
      extends ScoreCalculateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ScoreCalculateServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ScoreCalculateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScoreCalculateServiceFileDescriptorSupplier())
              .addMethod(getCalculateAverageScoreMethod())
              .addMethod(getConvertToOtherScoresMethod())
              .build();
        }
      }
    }
    return result;
  }
}
