package io.lbertel.demo.variables.infrastructure.routes;

import io.lbertel.demo.variables.infrastructure.routes.handler.VariablesFromApplicationPropertiesHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class AllVariablesFromApplicationPropertiesGetRoute {

    @Bean
    public RouterFunction<ServerResponse> route(VariablesFromApplicationPropertiesHandler handler) {
        return RouterFunctions.route(RequestPredicates.GET("/api/v1/application-file"), handler::ask);
    }

}
