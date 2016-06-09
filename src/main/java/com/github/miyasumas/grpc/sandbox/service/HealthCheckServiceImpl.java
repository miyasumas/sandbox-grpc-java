package com.github.miyasumas.grpc.sandbox.service;

import com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceGrpc.HealthCheckService;
import com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckRequest;
import com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckResponse;
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
public class HealthCheckServiceImpl implements HealthCheckService {

	public static final MethodDescriptor<HealthCheckRequest, HealthCheckResponse> METHOD_HEALTH_CHECK_JSON = MethodDescriptor
		.create(
			HealthCheckServiceGrpc.METHOD_HEALTH_CHECK.getType(),
			HealthCheckServiceGrpc.METHOD_HEALTH_CHECK.getFullMethodName(),
			ProtoUtils.jsonMarshaller(HealthCheckRequest.getDefaultInstance()),
			ProtoUtils.jsonMarshaller(HealthCheckResponse.getDefaultInstance()));

	public static final ServerServiceDefinition bindService(HealthCheckService service) {
		return ServerServiceDefinition.builder(HealthCheckServiceGrpc.SERVICE_NAME)
			.addMethod(
				METHOD_HEALTH_CHECK_JSON,
				ServerCalls.asyncUnaryCall(
					new UnaryMethod<HealthCheckRequest, HealthCheckResponse>() {
						@Override
						public void invoke(
							HealthCheckRequest request, StreamObserver<HealthCheckResponse> responseObserver) {
							service.healthCheck(request, responseObserver);
						}
					}))
			.build();
	}

	/**
	 * {@inheritDoc}
	 * @see com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceGrpc.HealthCheckService#healthCheck(com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceProtobuf.HealthCheckRequest,
	 *      io.grpc.stub.StreamObserver)
	 */
	@Override
	public void healthCheck(HealthCheckRequest request, StreamObserver<HealthCheckResponse> responseObserver) {
		HealthCheckResponse response = HealthCheckResponse.newBuilder()
			.setStatus(0)
			.setMessage("OK")
			.build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}
}
