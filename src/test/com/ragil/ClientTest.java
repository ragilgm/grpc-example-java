package com.ragil;

import com.ragil.example.server.GrpcServer;
import com.ragil.test.UserRequest;
import com.ragil.test.UserResponse;
import com.ragil.test.UserServicesGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ClientTest {

    private  UserServicesGrpc.UserServicesBlockingStub blockingStub;

    @BeforeAll
    public void setup(){
        ManagedChannel localhost = ManagedChannelBuilder.forAddress("localhost", 4040)
                .usePlaintext()
                .build();

         this.blockingStub = UserServicesGrpc.newBlockingStub(localhost);
    }

//    @Test
//    public void userTest(){
//
//        UserRequest ragil = UserRequest.newBuilder()
//                .setName("ragil")
//                .build();
//
//        UserResponse response = this.blockingStub.getNameServices(ragil);
//        System.out.println(response.getName());
//
//
//    }

}
