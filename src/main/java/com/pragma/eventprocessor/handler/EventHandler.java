package com.pragma.eventprocessor.handler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class EventHandler {

    @PostMapping("/events")
    public Mono<String> handleEvent(@RequestBody String event) {
        // Simular procesamiento de evento
        return Mono.just("Evento procesado: " + event);
    }
}