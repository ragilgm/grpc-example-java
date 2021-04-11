package com.ragil.example.server;

import com.ragil.test.UserRequest;
import com.ragil.test.UserResponse;
import com.ragil.test.UserResponses;
import com.ragil.test.UserServicesGrpc;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;


public class UserServices extends UserServicesGrpc.UserServicesImplBase {

    @Override
    public void getNameServices(UserRequest request, StreamObserver<UserResponses> responseObserver) {

        List<UserResponse> userResponses = new ArrayList<>();
        UserResponse userResponse = UserResponse.newBuilder().setName(request.getName()).build();

        for (int i = 0; i < 10000; i++) {
            userResponses.add(userResponse);
        }

        responseObserver.onNext(UserResponses.newBuilder().addAllNames(userResponses).build());
        responseObserver.onCompleted();

    }
}
