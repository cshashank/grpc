package com.skc.grpcserver;

import java.io.IOException;

import com.skc.GreetingService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GPRCServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		Server server = ServerBuilder.forPort(9090).addService(new GreetingService()).build();
		server.start();
		System.out.println("Server started at "+server.getPort());
		server.awaitTermination();
	}
}
