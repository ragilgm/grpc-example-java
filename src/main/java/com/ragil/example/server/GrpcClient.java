package com.ragil.example.server;

import com.ragil.test.UserRequest;
import com.ragil.test.UserResponse;
import com.ragil.test.UserServicesGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 4040)
                .usePlaintext()
                .build();

        UserServicesGrpc.UserServicesBlockingStub stub = UserServicesGrpc.newBlockingStub(channel);


    }
}
