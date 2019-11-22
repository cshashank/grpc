package com.skc;
import io.grpc.stub.StreamObserver;

import java.util.GregorianCalendar;

import com.google.protobuf.RpcCallback;
import com.google.protobuf.RpcController;
import com.skc.grpc.helloworld.*;
import com.skc.grpc.helloworld.HelloWorldServiceGrpc.HelloWorldServiceImplBase;

import com.skc.grpc.helloworld.*;

public class GreetingService extends HelloWorldServiceImplBase{

	
	@Override
	public void sayHello(Person request,
			StreamObserver<Greeting> responseObserver) {
		System.out.println("Inside greeting service");
		Greeting.Builder response = Greeting.newBuilder();
		response.setMessage("skc response");
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

		
	

}
