package com.ragil.test;

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
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: bank-service.proto")
public final class UserServicesGrpc {

  private UserServicesGrpc() {}

  public static final String SERVICE_NAME = "UserServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ragil.test.UserRequest,
      com.ragil.test.UserResponses> getGetNameServicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNameServices",
      requestType = com.ragil.test.UserRequest.class,
      responseType = com.ragil.test.UserResponses.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ragil.test.UserRequest,
      com.ragil.test.UserResponses> getGetNameServicesMethod() {
    io.grpc.MethodDescriptor<com.ragil.test.UserRequest, com.ragil.test.UserResponses> getGetNameServicesMethod;
    if ((getGetNameServicesMethod = UserServicesGrpc.getGetNameServicesMethod) == null) {
      synchronized (UserServicesGrpc.class) {
        if ((getGetNameServicesMethod = UserServicesGrpc.getGetNameServicesMethod) == null) {
          UserServicesGrpc.getGetNameServicesMethod = getGetNameServicesMethod = 
              io.grpc.MethodDescriptor.<com.ragil.test.UserRequest, com.ragil.test.UserResponses>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserServices", "getNameServices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ragil.test.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ragil.test.UserResponses.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServicesMethodDescriptorSupplier("getNameServices"))
                  .build();
          }
        }
     }
     return getGetNameServicesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServicesStub newStub(io.grpc.Channel channel) {
    return new UserServicesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServicesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServicesFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void getNameServices(com.ragil.test.UserRequest request,
        io.grpc.stub.StreamObserver<com.ragil.test.UserResponses> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNameServicesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetNameServicesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.ragil.test.UserRequest,
                com.ragil.test.UserResponses>(
                  this, METHODID_GET_NAME_SERVICES)))
          .build();
    }
  }

  /**
   */
  public static final class UserServicesStub extends io.grpc.stub.AbstractStub<UserServicesStub> {
    private UserServicesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServicesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServicesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServicesStub(channel, callOptions);
    }

    /**
     */
    public void getNameServices(com.ragil.test.UserRequest request,
        io.grpc.stub.StreamObserver<com.ragil.test.UserResponses> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNameServicesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServicesBlockingStub extends io.grpc.stub.AbstractStub<UserServicesBlockingStub> {
    private UserServicesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServicesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServicesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ragil.test.UserResponses getNameServices(com.ragil.test.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNameServicesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServicesFutureStub extends io.grpc.stub.AbstractStub<UserServicesFutureStub> {
    private UserServicesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServicesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServicesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ragil.test.UserResponses> getNameServices(
        com.ragil.test.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNameServicesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_NAME_SERVICES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_NAME_SERVICES:
          serviceImpl.getNameServices((com.ragil.test.UserRequest) request,
              (io.grpc.stub.StreamObserver<com.ragil.test.UserResponses>) responseObserver);
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

  private static abstract class UserServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ragil.test.BankService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserServices");
    }
  }

  private static final class UserServicesFileDescriptorSupplier
      extends UserServicesBaseDescriptorSupplier {
    UserServicesFileDescriptorSupplier() {}
  }

  private static final class UserServicesMethodDescriptorSupplier
      extends UserServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServicesFileDescriptorSupplier())
              .addMethod(getGetNameServicesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
