package generated.grpc.testservice;

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
    comments = "Source: TestService.proto")
public final class TestServiceGrpc {

  private TestServiceGrpc() {}

  public static final String SERVICE_NAME = "TestService.TestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.testservice.TestType,
      generated.grpc.testservice.TestResponse> getGetTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTest",
      requestType = generated.grpc.testservice.TestType.class,
      responseType = generated.grpc.testservice.TestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.testservice.TestType,
      generated.grpc.testservice.TestResponse> getGetTestMethod() {
    io.grpc.MethodDescriptor<generated.grpc.testservice.TestType, generated.grpc.testservice.TestResponse> getGetTestMethod;
    if ((getGetTestMethod = TestServiceGrpc.getGetTestMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getGetTestMethod = TestServiceGrpc.getGetTestMethod) == null) {
          TestServiceGrpc.getGetTestMethod = getGetTestMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.testservice.TestType, generated.grpc.testservice.TestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TestService.TestService", "getTest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.testservice.TestType.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.testservice.TestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("getTest"))
                  .build();
          }
        }
     }
     return getGetTestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.testservice.ListeningResponse,
      generated.grpc.testservice.ListeningQuestionOrScore> getGetListeningTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getListeningTest",
      requestType = generated.grpc.testservice.ListeningResponse.class,
      responseType = generated.grpc.testservice.ListeningQuestionOrScore.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.testservice.ListeningResponse,
      generated.grpc.testservice.ListeningQuestionOrScore> getGetListeningTestMethod() {
    io.grpc.MethodDescriptor<generated.grpc.testservice.ListeningResponse, generated.grpc.testservice.ListeningQuestionOrScore> getGetListeningTestMethod;
    if ((getGetListeningTestMethod = TestServiceGrpc.getGetListeningTestMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getGetListeningTestMethod = TestServiceGrpc.getGetListeningTestMethod) == null) {
          TestServiceGrpc.getGetListeningTestMethod = getGetListeningTestMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.testservice.ListeningResponse, generated.grpc.testservice.ListeningQuestionOrScore>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "TestService.TestService", "getListeningTest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.testservice.ListeningResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.testservice.ListeningQuestionOrScore.getDefaultInstance()))
                  .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("getListeningTest"))
                  .build();
          }
        }
     }
     return getGetListeningTestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.testservice.SpeakingResponse,
      generated.grpc.testservice.SpeakingQuestionOrScore> getGetSpeakingTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSpeakingTest",
      requestType = generated.grpc.testservice.SpeakingResponse.class,
      responseType = generated.grpc.testservice.SpeakingQuestionOrScore.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.testservice.SpeakingResponse,
      generated.grpc.testservice.SpeakingQuestionOrScore> getGetSpeakingTestMethod() {
    io.grpc.MethodDescriptor<generated.grpc.testservice.SpeakingResponse, generated.grpc.testservice.SpeakingQuestionOrScore> getGetSpeakingTestMethod;
    if ((getGetSpeakingTestMethod = TestServiceGrpc.getGetSpeakingTestMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getGetSpeakingTestMethod = TestServiceGrpc.getGetSpeakingTestMethod) == null) {
          TestServiceGrpc.getGetSpeakingTestMethod = getGetSpeakingTestMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.testservice.SpeakingResponse, generated.grpc.testservice.SpeakingQuestionOrScore>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "TestService.TestService", "getSpeakingTest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.testservice.SpeakingResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.testservice.SpeakingQuestionOrScore.getDefaultInstance()))
                  .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("getSpeakingTest"))
                  .build();
          }
        }
     }
     return getGetSpeakingTestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.testservice.ReadingResponse,
      generated.grpc.testservice.ReadingQuestionOrScore> getGetReadingTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getReadingTest",
      requestType = generated.grpc.testservice.ReadingResponse.class,
      responseType = generated.grpc.testservice.ReadingQuestionOrScore.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.testservice.ReadingResponse,
      generated.grpc.testservice.ReadingQuestionOrScore> getGetReadingTestMethod() {
    io.grpc.MethodDescriptor<generated.grpc.testservice.ReadingResponse, generated.grpc.testservice.ReadingQuestionOrScore> getGetReadingTestMethod;
    if ((getGetReadingTestMethod = TestServiceGrpc.getGetReadingTestMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getGetReadingTestMethod = TestServiceGrpc.getGetReadingTestMethod) == null) {
          TestServiceGrpc.getGetReadingTestMethod = getGetReadingTestMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.testservice.ReadingResponse, generated.grpc.testservice.ReadingQuestionOrScore>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "TestService.TestService", "getReadingTest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.testservice.ReadingResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.testservice.ReadingQuestionOrScore.getDefaultInstance()))
                  .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("getReadingTest"))
                  .build();
          }
        }
     }
     return getGetReadingTestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.testservice.WritingResponse,
      generated.grpc.testservice.WritingQuestionOrScore> getGetWritingTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getWritingTest",
      requestType = generated.grpc.testservice.WritingResponse.class,
      responseType = generated.grpc.testservice.WritingQuestionOrScore.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.testservice.WritingResponse,
      generated.grpc.testservice.WritingQuestionOrScore> getGetWritingTestMethod() {
    io.grpc.MethodDescriptor<generated.grpc.testservice.WritingResponse, generated.grpc.testservice.WritingQuestionOrScore> getGetWritingTestMethod;
    if ((getGetWritingTestMethod = TestServiceGrpc.getGetWritingTestMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getGetWritingTestMethod = TestServiceGrpc.getGetWritingTestMethod) == null) {
          TestServiceGrpc.getGetWritingTestMethod = getGetWritingTestMethod = 
              io.grpc.MethodDescriptor.<generated.grpc.testservice.WritingResponse, generated.grpc.testservice.WritingQuestionOrScore>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "TestService.TestService", "getWritingTest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.testservice.WritingResponse.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.testservice.WritingQuestionOrScore.getDefaultInstance()))
                  .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("getWritingTest"))
                  .build();
          }
        }
     }
     return getGetWritingTestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestServiceStub newStub(io.grpc.Channel channel) {
    return new TestServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TestServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TestServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TestServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary request for selecting test type
     * </pre>
     */
    public void getTest(generated.grpc.testservice.TestType request,
        io.grpc.stub.StreamObserver<generated.grpc.testservice.TestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Listening - bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.testservice.ListeningResponse> getListeningTest(
        io.grpc.stub.StreamObserver<generated.grpc.testservice.ListeningQuestionOrScore> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetListeningTestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Speaking - bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.testservice.SpeakingResponse> getSpeakingTest(
        io.grpc.stub.StreamObserver<generated.grpc.testservice.SpeakingQuestionOrScore> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetSpeakingTestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reading - bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.testservice.ReadingResponse> getReadingTest(
        io.grpc.stub.StreamObserver<generated.grpc.testservice.ReadingQuestionOrScore> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetReadingTestMethod(), responseObserver);
    }

    /**
     * <pre>
     * Writing - bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.testservice.WritingResponse> getWritingTest(
        io.grpc.stub.StreamObserver<generated.grpc.testservice.WritingQuestionOrScore> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetWritingTestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.grpc.testservice.TestType,
                generated.grpc.testservice.TestResponse>(
                  this, METHODID_GET_TEST)))
          .addMethod(
            getGetListeningTestMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                generated.grpc.testservice.ListeningResponse,
                generated.grpc.testservice.ListeningQuestionOrScore>(
                  this, METHODID_GET_LISTENING_TEST)))
          .addMethod(
            getGetSpeakingTestMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                generated.grpc.testservice.SpeakingResponse,
                generated.grpc.testservice.SpeakingQuestionOrScore>(
                  this, METHODID_GET_SPEAKING_TEST)))
          .addMethod(
            getGetReadingTestMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                generated.grpc.testservice.ReadingResponse,
                generated.grpc.testservice.ReadingQuestionOrScore>(
                  this, METHODID_GET_READING_TEST)))
          .addMethod(
            getGetWritingTestMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                generated.grpc.testservice.WritingResponse,
                generated.grpc.testservice.WritingQuestionOrScore>(
                  this, METHODID_GET_WRITING_TEST)))
          .build();
    }
  }

  /**
   */
  public static final class TestServiceStub extends io.grpc.stub.AbstractStub<TestServiceStub> {
    private TestServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary request for selecting test type
     * </pre>
     */
    public void getTest(generated.grpc.testservice.TestType request,
        io.grpc.stub.StreamObserver<generated.grpc.testservice.TestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Listening - bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.testservice.ListeningResponse> getListeningTest(
        io.grpc.stub.StreamObserver<generated.grpc.testservice.ListeningQuestionOrScore> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetListeningTestMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Speaking - bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.testservice.SpeakingResponse> getSpeakingTest(
        io.grpc.stub.StreamObserver<generated.grpc.testservice.SpeakingQuestionOrScore> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetSpeakingTestMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Reading - bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.testservice.ReadingResponse> getReadingTest(
        io.grpc.stub.StreamObserver<generated.grpc.testservice.ReadingQuestionOrScore> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetReadingTestMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Writing - bidirectional streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.testservice.WritingResponse> getWritingTest(
        io.grpc.stub.StreamObserver<generated.grpc.testservice.WritingQuestionOrScore> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getGetWritingTestMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class TestServiceBlockingStub extends io.grpc.stub.AbstractStub<TestServiceBlockingStub> {
    private TestServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary request for selecting test type
     * </pre>
     */
    public generated.grpc.testservice.TestResponse getTest(generated.grpc.testservice.TestType request) {
      return blockingUnaryCall(
          getChannel(), getGetTestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TestServiceFutureStub extends io.grpc.stub.AbstractStub<TestServiceFutureStub> {
    private TestServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary request for selecting test type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.testservice.TestResponse> getTest(
        generated.grpc.testservice.TestType request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TEST = 0;
  private static final int METHODID_GET_LISTENING_TEST = 1;
  private static final int METHODID_GET_SPEAKING_TEST = 2;
  private static final int METHODID_GET_READING_TEST = 3;
  private static final int METHODID_GET_WRITING_TEST = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TEST:
          serviceImpl.getTest((generated.grpc.testservice.TestType) request,
              (io.grpc.stub.StreamObserver<generated.grpc.testservice.TestResponse>) responseObserver);
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
        case METHODID_GET_LISTENING_TEST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getListeningTest(
              (io.grpc.stub.StreamObserver<generated.grpc.testservice.ListeningQuestionOrScore>) responseObserver);
        case METHODID_GET_SPEAKING_TEST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getSpeakingTest(
              (io.grpc.stub.StreamObserver<generated.grpc.testservice.SpeakingQuestionOrScore>) responseObserver);
        case METHODID_GET_READING_TEST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getReadingTest(
              (io.grpc.stub.StreamObserver<generated.grpc.testservice.ReadingQuestionOrScore>) responseObserver);
        case METHODID_GET_WRITING_TEST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getWritingTest(
              (io.grpc.stub.StreamObserver<generated.grpc.testservice.WritingQuestionOrScore>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.testservice.TestServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestService");
    }
  }

  private static final class TestServiceFileDescriptorSupplier
      extends TestServiceBaseDescriptorSupplier {
    TestServiceFileDescriptorSupplier() {}
  }

  private static final class TestServiceMethodDescriptorSupplier
      extends TestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestServiceFileDescriptorSupplier())
              .addMethod(getGetTestMethod())
              .addMethod(getGetListeningTestMethod())
              .addMethod(getGetSpeakingTestMethod())
              .addMethod(getGetReadingTestMethod())
              .addMethod(getGetWritingTestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
