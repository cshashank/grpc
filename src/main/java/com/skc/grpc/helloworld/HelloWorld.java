// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloWorld.proto

package com.skc.grpc.helloworld;

public final class HelloWorld {
  private HelloWorld() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skc_grpc_helloworld_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skc_grpc_helloworld_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_skc_grpc_helloworld_Greeting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_skc_grpc_helloworld_Greeting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020helloWorld.proto\022\027com.skc.grpc.hellowo" +
      "rld\"/\n\006Person\022\022\n\nfirst_name\030\001 \001(\t\022\021\n\tlas" +
      "t_name\030\002 \001(\t\"\033\n\010Greeting\022\017\n\007message\030\001 \001(" +
      "\t2c\n\021HelloWorldService\022N\n\010sayHello\022\037.com" +
      ".skc.grpc.helloworld.Person\032!.com.skc.gr" +
      "pc.helloworld.GreetingB\005P\001\210\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_skc_grpc_helloworld_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_skc_grpc_helloworld_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skc_grpc_helloworld_Person_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_com_skc_grpc_helloworld_Greeting_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_skc_grpc_helloworld_Greeting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_skc_grpc_helloworld_Greeting_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
