package com.github.miyasumas.grpc.sandbox.service;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 0.14.0)",
    comments = "Source: HealthCheck.proto")
public class HealthCheckServiceGrpc {

  private HealthCheckServiceGrpc() {}

  public static final String SERVICE_NAME = "sandbox.HealthCheckService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckRequest,
      com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckResponse> METHOD_HEALTH_CHECK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "sandbox.HealthCheckService", "HealthCheck"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HealthCheckServiceStub newStub(io.grpc.Channel channel) {
    return new HealthCheckServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HealthCheckServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HealthCheckServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static HealthCheckServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HealthCheckServiceFutureStub(channel);
  }

  /**
   */
  public static interface HealthCheckService {

    /**
     */
    public void healthCheck(com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckResponse> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractHealthCheckService implements HealthCheckService, io.grpc.BindableService {

    @java.lang.Override
    public void healthCheck(com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HEALTH_CHECK, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return HealthCheckServiceGrpc.bindService(this);
    }
  }

  /**
   */
  public static interface HealthCheckServiceBlockingClient {

    /**
     */
    public com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckResponse healthCheck(com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckRequest request);
  }

  /**
   */
  public static interface HealthCheckServiceFutureClient {

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckResponse> healthCheck(
        com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckRequest request);
  }

  public static class HealthCheckServiceStub extends io.grpc.stub.AbstractStub<HealthCheckServiceStub>
      implements HealthCheckService {
    private HealthCheckServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthCheckServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthCheckServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthCheckServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void healthCheck(com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HEALTH_CHECK, getCallOptions()), request, responseObserver);
    }
  }

  public static class HealthCheckServiceBlockingStub extends io.grpc.stub.AbstractStub<HealthCheckServiceBlockingStub>
      implements HealthCheckServiceBlockingClient {
    private HealthCheckServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthCheckServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthCheckServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthCheckServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckResponse healthCheck(com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HEALTH_CHECK, getCallOptions(), request);
    }
  }

  public static class HealthCheckServiceFutureStub extends io.grpc.stub.AbstractStub<HealthCheckServiceFutureStub>
      implements HealthCheckServiceFutureClient {
    private HealthCheckServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HealthCheckServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthCheckServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HealthCheckServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckResponse> healthCheck(
        com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HEALTH_CHECK, getCallOptions()), request);
    }
  }

  private static final int METHODID_HEALTH_CHECK = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HealthCheckService serviceImpl;
    private final int methodId;

    public MethodHandlers(HealthCheckService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HEALTH_CHECK:
          serviceImpl.healthCheck((com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckRequest) request,
              (io.grpc.stub.StreamObserver<com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckResponse>) responseObserver);
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

  public static io.grpc.ServerServiceDefinition bindService(
      final HealthCheckService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_HEALTH_CHECK,
          asyncUnaryCall(
            new MethodHandlers<
              com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckRequest,
              com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckResponse>(
                serviceImpl, METHODID_HEALTH_CHECK)))
        .build();
  }
}
