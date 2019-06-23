package com.example.demo.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class MessageHandler {

    public  Mono<ServerResponse> readMessage(ServerRequest serverRequest) {
        return ServerResponse.ok().body(Mono.just("Message is fine"), String.class);
    }
}
