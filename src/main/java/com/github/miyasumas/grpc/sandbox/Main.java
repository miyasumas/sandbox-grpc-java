package com.github.miyasumas.grpc.sandbox;

import java.io.IOException;
import com.github.miyasumas.grpc.sandbox.service.HealthCheckServiceImpl;
import com.github.miyasumas.grpc.sandbox.service.QueueServiceGrpc;
import com.github.miyasumas.grpc.sandbox.service.QueueServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;

/**
 * @author MIYASAKA Yasumasa
 * @since 2016/05/02
 */
public class Main {

	private int port = 50051;
	private Server server;

	private void start() throws IOException {
		server = ServerBuilder.forPort(port)
			.addService(HealthCheckServiceImpl.bindService(new HealthCheckServiceImpl()))
			.addService(QueueServiceImpl.bindService(new QueueServiceImpl()))
			.build()
			.start();
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				// Use stderr here since the logger may have been reset by its JVM shutdown hook.
				System.err.println("*** shutting down gRPC server since JVM is shutting down");
				Main.this.stop();
				System.err.println("*** server shut down");
			}
		});
	}

	private void stop() {
		if (server != null) {
			server.shutdown();
		}
	}

	/**
	 * Await termination on the main thread since the grpc library uses daemon threads.
	 */
	private void blockUntilShutdown() throws InterruptedException {
		if (server != null) {
			server.awaitTermination();
		}
	}

	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		final Main server = new Main();
		server.start();
		server.blockUntilShutdown();
	}
}
