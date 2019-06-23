package com.example.demo.routes;

import com.example.demo.handler.HelloHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class HelloRoutes {

    @Bean
    RouterFunction<ServerResponse> helloRouterFunction(HelloHandler helloHandler) {
        return RouterFunctions.route(RequestPredicates.path("/"),
                helloHandler::handleRequest);
    }
}
