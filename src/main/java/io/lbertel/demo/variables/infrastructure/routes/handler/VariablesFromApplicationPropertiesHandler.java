package io.lbertel.demo.variables.infrastructure.routes.handler;

import io.lbertel.demo.shared.config.MapQueueApplicationFile;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.HashMap;

@Component
public class VariablesFromApplicationPropertiesHandler {

    public final MapQueueApplicationFile mapQueueApplicationFile;

    public VariablesFromApplicationPropertiesHandler(MapQueueApplicationFile mapQueueApplicationFile) {
        this.mapQueueApplicationFile = mapQueueApplicationFile;
    }

    public Mono<ServerResponse> ask(ServerRequest request) {
        return ServerResponse.ok()
                             .contentType(MediaType.APPLICATION_JSON)
                             .body(Mono.just(mapQueueApplicationFile.getSap()), HashMap.class);
    }

}
