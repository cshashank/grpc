// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloWorld.proto

package com.skc.grpc.helloworld;

/**
 * Protobuf service {@code com.skc.grpc.helloworld.HelloWorldService}
 */
public  abstract class HelloWorldService
    implements com.google.protobuf.Service {
  protected HelloWorldService() {}

  public interface Interface {
    /**
     * <code>rpc sayHello(.com.skc.grpc.helloworld.Person) returns (.com.skc.grpc.helloworld.Greeting);</code>
     */
    public abstract void sayHello(
        com.google.protobuf.RpcController controller,
        com.skc.grpc.helloworld.Person request,
        com.google.protobuf.RpcCallback<com.skc.grpc.helloworld.Greeting> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new HelloWorldService() {
      @java.lang.Override
      public  void sayHello(
          com.google.protobuf.RpcController controller,
          com.skc.grpc.helloworld.Person request,
          com.google.protobuf.RpcCallback<com.skc.grpc.helloworld.Greeting> done) {
        impl.sayHello(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.sayHello(controller, (com.skc.grpc.helloworld.Person)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.skc.grpc.helloworld.Person.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.skc.grpc.helloworld.Greeting.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc sayHello(.com.skc.grpc.helloworld.Person) returns (.com.skc.grpc.helloworld.Greeting);</code>
   */
  public abstract void sayHello(
      com.google.protobuf.RpcController controller,
      com.skc.grpc.helloworld.Person request,
      com.google.protobuf.RpcCallback<com.skc.grpc.helloworld.Greeting> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return com.skc.grpc.helloworld.HelloWorld.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.sayHello(controller, (com.skc.grpc.helloworld.Person)request,
          com.google.protobuf.RpcUtil.<com.skc.grpc.helloworld.Greeting>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.skc.grpc.helloworld.Person.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.skc.grpc.helloworld.Greeting.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends com.skc.grpc.helloworld.HelloWorldService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void sayHello(
        com.google.protobuf.RpcController controller,
        com.skc.grpc.helloworld.Person request,
        com.google.protobuf.RpcCallback<com.skc.grpc.helloworld.Greeting> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.skc.grpc.helloworld.Greeting.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.skc.grpc.helloworld.Greeting.class,
          com.skc.grpc.helloworld.Greeting.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public com.skc.grpc.helloworld.Greeting sayHello(
        com.google.protobuf.RpcController controller,
        com.skc.grpc.helloworld.Person request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public com.skc.grpc.helloworld.Greeting sayHello(
        com.google.protobuf.RpcController controller,
        com.skc.grpc.helloworld.Person request)
        throws com.google.protobuf.ServiceException {
      return (com.skc.grpc.helloworld.Greeting) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.skc.grpc.helloworld.Greeting.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:com.skc.grpc.helloworld.HelloWorldService)
}
