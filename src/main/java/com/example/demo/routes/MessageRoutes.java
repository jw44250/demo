package com.example.demo.routes;

import com.example.demo.handler.MessageHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class MessageRoutes {


    @Bean
    public RouterFunction<ServerResponse> messageRoute(MessageHandler messageHandler){

        return route((GET("/messages")), messageHandler::readMessage);
    }
}
