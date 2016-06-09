package com.github.miyasumas.grpc.sandbox.service;

import com.github.miyasumas.grpc.sandbox.service.QueueServiceGrpc.QueueService;
import com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueRequest;
import com.github.miyasumas.grpc.sandbox.service.QueueServiceProtobuf.QueueResponse;
import io.grpc.MethodDescriptor;
import io.grpc.ServerServiceDefinition;
import io.grpc.protobuf.ProtoUtils;
import io.grpc.stub.ServerCalls;
import io.grpc.stub.ServerCalls.UnaryMethod;
import io.grpc.stub.StreamObserver;

/**
 * @author MIYASAKA Yasumasa
 * @since 2016/05/02
 */
public class QueueServiceImpl implements QueueService {

	public static final MethodDescriptor<QueueRequest, QueueResponse> METHOD_ENQUEUE_JSON = MethodDescriptor.create(
		QueueServiceGrpc.METHOD_ENQUEUE.getType(),
		QueueServiceGrpc.METHOD_ENQUEUE.getFullMethodName(),
		ProtoUtils.jsonMarshaller(QueueRequest.getDefaultInstance()),
		ProtoUtils.jsonMarshaller(QueueResponse.getDefaultInstance()));

	public static final ServerServiceDefinition bindService(QueueService service) {
		return ServerServiceDefinition.builder(QueueServiceGrpc.SERVICE_NAME)
			.addMethod(
				METHOD_ENQUEUE_JSON,
				ServerCalls.asyncUnaryCall(
					new UnaryMethod<QueueRequest, QueueResponse>() {
						@Override
						public void invoke(
							QueueRequest request, StreamObserver<QueueResponse> responseObserver) {
							service.enqueue(request, responseObserver);
						}
					}))
			.build();
	}

	/**
	 * {@inheritDoc}
	 * @see com.github.miyasumas.grpc.sandbox.service.QueueServiceGrpc.QueueService#enqueue(com.github.miyasumas.grpc.sandbox.service.QueueServiceOuterClass.QueueRequest,
	 *      io.grpc.stub.StreamObserver)
	 */
	@Override
	public void enqueue(QueueRequest request, StreamObserver<QueueResponse> responseObserver) {
		QueueResponse response = QueueResponse.newBuilder()
			.setPriority(request.getPriority())
			.setUserId(request.getUserId())
			.setStatus(0)
			.build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	/**
	 * {@inheritDoc}
	 * @see com.github.miyasumas.grpc.sandbox.service.QueueServiceGrpc.QueueService#dequeue(com.github.miyasumas.grpc.sandbox.service.QueueServiceOuterClass.QueueRequest,
	 *      io.grpc.stub.StreamObserver)
	 */
	@Override
	public void dequeue(QueueRequest request, StreamObserver<QueueResponse> responseObserver) {
		QueueResponse response = QueueResponse.newBuilder().setStatus(0).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
}
