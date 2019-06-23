package com.example.demo.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.HandlerFunction;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HelloHandler {
    public  Mono<ServerResponse> handleRequest(ServerRequest serverRequest) {
        return ServerResponse.ok().body(Mono.just("Hello World!"), String.class);
    }
}