package generated.grpc.newwordsservice;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: NewWordsService.proto")
public final class NewWordsServiceGrpc {

  private NewWordsServiceGrpc() {}

  public static final String SERVICE_NAME = "NewWordsService.NewWordsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      generated.grpc.newwordsservice.Topic> getTopicRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TopicRequest",
      requestType = com.google.protobuf.Empty.class,
      responseType = generated.grpc.newwordsservice.Topic.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      generated.grpc.newwordsservice.Topic> getTopicRequestMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, generated.grpc.newwordsservice.Topic> getTopicRequestMethod;
    if ((getTopicRequestMethod = NewWordsServiceGrpc.getTopicRequestMethod) == null) {
      synchronized (NewWordsServiceGrpc.class) {
        if ((getTopicRequestMethod = NewWordsServiceGrpc.getTopicRequestMethod) == null) {
          NewWordsServiceGrpc.getTopicRequestMethod = getTopicRequestMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, generated.grpc.newwordsservice.Topic>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "NewWordsService.NewWordsService", "TopicRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.newwordsservice.Topic.getDefaultInstance()))
                  .setSchemaDescriptor(new NewWordsServiceMethodDescriptorSupplier("TopicRequest"))
                  .build();
          }
        }
     }
     return getTopicRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.newwordsservice.Topic,
      generated.grpc.newwordsservice.WordList> getWordsByTopicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WordsByTopic",
      requestType = generated.grpc.newwordsservice.Topic.class,
      responseType = generated.grpc.newwordsservice.WordList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.newwordsservice.Topic,
      generated.grpc.newwordsservice.WordList> getWordsByTopicMethod() {
    io.grpc.MethodDescriptor<generated.grpc.newwordsservice.Topic, generated.grpc.newwordsservice.WordList> getWordsByTopicMethod;
    if ((getWordsByTopicMethod = NewWordsServiceGrpc.getWordsByTopicMethod) == null) {
      synchronized (NewWordsServiceGrpc.class) {
        if ((getWordsByTopicMethod = NewWordsServiceGrpc.getWordsByTopicMethod) == null) {
          NewWordsServiceGrpc.getWordsByTopicMethod = getWordsByTopicMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.newwordsservice.Topic, generated.grpc.newwordsservice.WordList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "NewWordsService.NewWordsService", "WordsByTopic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.newwordsservice.Topic.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.newwordsservice.WordList.getDefaultInstance()))
                  .setSchemaDescriptor(new NewWordsServiceMethodDescriptorSupplier("WordsByTopic"))
                  .build();
          }
        }
     }
     return getWordsByTopicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.newwordsservice.Word,
      generated.grpc.newwordsservice.WordDetail> getWordDefinitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WordDefinition",
      requestType = generated.grpc.newwordsservice.Word.class,
      responseType = generated.grpc.newwordsservice.WordDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.newwordsservice.Word,
      generated.grpc.newwordsservice.WordDetail> getWordDefinitionMethod() {
    io.grpc.MethodDescriptor<generated.grpc.newwordsservice.Word, generated.grpc.newwordsservice.WordDetail> getWordDefinitionMethod;
    if ((getWordDefinitionMethod = NewWordsServiceGrpc.getWordDefinitionMethod) == null) {
      synchronized (NewWordsServiceGrpc.class) {
        if ((getWordDefinitionMethod = NewWordsServiceGrpc.getWordDefinitionMethod) == null) {
          NewWordsServiceGrpc.getWordDefinitionMethod = getWordDefinitionMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.newwordsservice.Word, generated.grpc.newwordsservice.WordDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NewWordsService.NewWordsService", "WordDefinition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.newwordsservice.Word.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.newwordsservice.WordDetail.getDefaultInstance()))
                  .setSchemaDescriptor(new NewWordsServiceMethodDescriptorSupplier("WordDefinition"))
                  .build();
          }
        }
     }
     return getWordDefinitionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NewWordsServiceStub newStub(io.grpc.Channel channel) {
    return new NewWordsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NewWordsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NewWordsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NewWordsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NewWordsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NewWordsServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Server returns available topic from the database
     * server streaming
     * </pre>
     */
    public void topicRequest(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<generated.grpc.newwordsservice.Topic> responseObserver) {
      asyncUnimplementedUnaryCall(getTopicRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client sends a topic, server returns a stream of words related to the topic
     * server streaming
     * </pre>
     */
    public void wordsByTopic(generated.grpc.newwordsservice.Topic request,
        io.grpc.stub.StreamObserver<generated.grpc.newwordsservice.WordList> responseObserver) {
      asyncUnimplementedUnaryCall(getWordsByTopicMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client sends a word, server returns the word definition
     * unary
     * </pre>
     */
    public void wordDefinition(generated.grpc.newwordsservice.Word request,
        io.grpc.stub.StreamObserver<generated.grpc.newwordsservice.WordDetail> responseObserver) {
      asyncUnimplementedUnaryCall(getWordDefinitionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTopicRequestMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                generated.grpc.newwordsservice.Topic>(
                  this, METHODID_TOPIC_REQUEST)))
          .addMethod(
            getWordsByTopicMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                generated.grpc.newwordsservice.Topic,
                generated.grpc.newwordsservice.WordList>(
                  this, METHODID_WORDS_BY_TOPIC)))
          .addMethod(
            getWordDefinitionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.grpc.newwordsservice.Word,
                generated.grpc.newwordsservice.WordDetail>(
                  this, METHODID_WORD_DEFINITION)))
          .build();
    }
  }

  /**
   */
  public static final class NewWordsServiceStub extends io.grpc.stub.AbstractStub<NewWordsServiceStub> {
    private NewWordsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NewWordsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewWordsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NewWordsServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server returns available topic from the database
     * server streaming
     * </pre>
     */
    public void topicRequest(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<generated.grpc.newwordsservice.Topic> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getTopicRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client sends a topic, server returns a stream of words related to the topic
     * server streaming
     * </pre>
     */
    public void wordsByTopic(generated.grpc.newwordsservice.Topic request,
        io.grpc.stub.StreamObserver<generated.grpc.newwordsservice.WordList> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWordsByTopicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client sends a word, server returns the word definition
     * unary
     * </pre>
     */
    public void wordDefinition(generated.grpc.newwordsservice.Word request,
        io.grpc.stub.StreamObserver<generated.grpc.newwordsservice.WordDetail> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWordDefinitionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NewWordsServiceBlockingStub extends io.grpc.stub.AbstractStub<NewWordsServiceBlockingStub> {
    private NewWordsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NewWordsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewWordsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NewWordsServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Server returns available topic from the database
     * server streaming
     * </pre>
     */
    public java.util.Iterator<generated.grpc.newwordsservice.Topic> topicRequest(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getTopicRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Client sends a topic, server returns a stream of words related to the topic
     * server streaming
     * </pre>
     */
    public java.util.Iterator<generated.grpc.newwordsservice.WordList> wordsByTopic(
        generated.grpc.newwordsservice.Topic request) {
      return blockingServerStreamingCall(
          getChannel(), getWordsByTopicMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Client sends a word, server returns the word definition
     * unary
     * </pre>
     */
    public generated.grpc.newwordsservice.WordDetail wordDefinition(generated.grpc.newwordsservice.Word request) {
      return blockingUnaryCall(
          getChannel(), getWordDefinitionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NewWordsServiceFutureStub extends io.grpc.stub.AbstractStub<NewWordsServiceFutureStub> {
    private NewWordsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NewWordsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NewWordsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NewWordsServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client sends a word, server returns the word definition
     * unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.newwordsservice.WordDetail> wordDefinition(
        generated.grpc.newwordsservice.Word request) {
      return futureUnaryCall(
          getChannel().newCall(getWordDefinitionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOPIC_REQUEST = 0;
  private static final int METHODID_WORDS_BY_TOPIC = 1;
  private static final int METHODID_WORD_DEFINITION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NewWordsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NewWordsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TOPIC_REQUEST:
          serviceImpl.topicRequest((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<generated.grpc.newwordsservice.Topic>) responseObserver);
          break;
        case METHODID_WORDS_BY_TOPIC:
          serviceImpl.wordsByTopic((generated.grpc.newwordsservice.Topic) request,
              (io.grpc.stub.StreamObserver<generated.grpc.newwordsservice.WordList>) responseObserver);
          break;
        case METHODID_WORD_DEFINITION:
          serviceImpl.wordDefinition((generated.grpc.newwordsservice.Word) request,
              (io.grpc.stub.StreamObserver<generated.grpc.newwordsservice.WordDetail>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NewWordsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NewWordsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.newwordsservice.NewWordsServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NewWordsService");
    }
  }

  private static final class NewWordsServiceFileDescriptorSupplier
      extends NewWordsServiceBaseDescriptorSupplier {
    NewWordsServiceFileDescriptorSupplier() {}
  }

  private static final class NewWordsServiceMethodDescriptorSupplier
      extends NewWordsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NewWordsServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NewWordsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NewWordsServiceFileDescriptorSupplier())
              .addMethod(getTopicRequestMethod())
              .addMethod(getWordsByTopicMethod())
              .addMethod(getWordDefinitionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
