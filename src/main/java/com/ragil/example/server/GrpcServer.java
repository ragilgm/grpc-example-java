package com.ragil.example.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("incomming request");
        Server server = ServerBuilder
                .forPort(4040)
                .addService(new UserServices())
                .build();
        System.out.println("server listening onport 4040");
        server.start();
        server.awaitTermination();
    }

}
