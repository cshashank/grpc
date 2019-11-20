rm -r -fo C:\workspace\grpc\src\main\java\*
protoc --proto_path=../src --java_out=../src/main/java ../src/main/resources/helloWorld.proto