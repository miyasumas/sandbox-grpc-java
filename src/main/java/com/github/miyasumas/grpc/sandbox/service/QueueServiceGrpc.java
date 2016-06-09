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
    comments = "Source: QueueService.proto")
public class QueueServiceGrpc {

  private QueueServiceGrpc() {}

  public static final String SERVICE_NAME = "sandbox.QueueService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest,
      com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse> METHOD_ENQUEUE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "sandbox.QueueService", "enqueue"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest,
      com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse> METHOD_DEQUEUE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "sandbox.QueueService", "dequeue"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueueServiceStub newStub(io.grpc.Channel channel) {
    return new QueueServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueueServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static QueueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueueServiceFutureStub(channel);
  }

  /**
   */
  public static interface QueueService {

    /**
     */
    public void enqueue(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest request,
        io.grpc.stub.StreamObserver<com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse> responseObserver);

    /**
     */
    public void dequeue(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest request,
        io.grpc.stub.StreamObserver<com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse> responseObserver);
  }

  @io.grpc.ExperimentalApi
  public static abstract class AbstractQueueService implements QueueService, io.grpc.BindableService {

    @java.lang.Override
    public void enqueue(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest request,
        io.grpc.stub.StreamObserver<com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ENQUEUE, responseObserver);
    }

    @java.lang.Override
    public void dequeue(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest request,
        io.grpc.stub.StreamObserver<com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEQUEUE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return QueueServiceGrpc.bindService(this);
    }
  }

  /**
   */
  public static interface QueueServiceBlockingClient {

    /**
     */
    public com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse enqueue(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest request);

    /**
     */
    public com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse dequeue(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest request);
  }

  /**
   */
  public static interface QueueServiceFutureClient {

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse> enqueue(
        com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest request);

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse> dequeue(
        com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest request);
  }

  public static class QueueServiceStub extends io.grpc.stub.AbstractStub<QueueServiceStub>
      implements QueueService {
    private QueueServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueueServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueueServiceStub(channel, callOptions);
    }

    @java.lang.Override
    public void enqueue(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest request,
        io.grpc.stub.StreamObserver<com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ENQUEUE, getCallOptions()), request, responseObserver);
    }

    @java.lang.Override
    public void dequeue(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest request,
        io.grpc.stub.StreamObserver<com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEQUEUE, getCallOptions()), request, responseObserver);
    }
  }

  public static class QueueServiceBlockingStub extends io.grpc.stub.AbstractStub<QueueServiceBlockingStub>
      implements QueueServiceBlockingClient {
    private QueueServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueueServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueueServiceBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse enqueue(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ENQUEUE, getCallOptions(), request);
    }

    @java.lang.Override
    public com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse dequeue(com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEQUEUE, getCallOptions(), request);
    }
  }

  public static class QueueServiceFutureStub extends io.grpc.stub.AbstractStub<QueueServiceFutureStub>
      implements QueueServiceFutureClient {
    private QueueServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueueServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueueServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueueServiceFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse> enqueue(
        com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ENQUEUE, getCallOptions()), request);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse> dequeue(
        com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEQUEUE, getCallOptions()), request);
    }
  }

  private static final int METHODID_ENQUEUE = 0;
  private static final int METHODID_DEQUEUE = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueueService serviceImpl;
    private final int methodId;

    public MethodHandlers(QueueService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENQUEUE:
          serviceImpl.enqueue((com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest) request,
              (io.grpc.stub.StreamObserver<com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse>) responseObserver);
          break;
        case METHODID_DEQUEUE:
          serviceImpl.dequeue((com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest) request,
              (io.grpc.stub.StreamObserver<com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse>) responseObserver);
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
      final QueueService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
        .addMethod(
          METHOD_ENQUEUE,
          asyncUnaryCall(
            new MethodHandlers<
              com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest,
              com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse>(
                serviceImpl, METHODID_ENQUEUE)))
        .addMethod(
          METHOD_DEQUEUE,
          asyncUnaryCall(
            new MethodHandlers<
              com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest,
              com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse>(
                serviceImpl, METHODID_DEQUEUE)))
        .build();
  }
}
