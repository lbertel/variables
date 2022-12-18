package io.lbertel.demo.variables.infrastructure.routes.handler;

import io.lbertel.demo.shared.config.MapQueueYmlFile;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.HashMap;

@Component
public class VariablesFromYmlFileHandler {

    private final MapQueueYmlFile mapQueue;

    public VariablesFromYmlFileHandler(MapQueueYmlFile mapQueue) {
        this.mapQueue = mapQueue;
    }

    public Mono<ServerResponse> ask(ServerRequest request) {

        System.out.println(mapQueue.getOipa());

        return ServerResponse.ok()
                             .contentType(MediaType.APPLICATION_JSON)
                             .body(Mono.just(mapQueue.getOipa()), HashMap.class);
    }
}
