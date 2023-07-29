package com.learnreactiveprogramming.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.List;

public class FluxAndMonoGeneratorService {

    public Flux<String> nameFlux() {
        return Flux.fromIterable(List.of("alex","ben","cloe"));
    }

    public Mono<String> nameMono(){
        return Mono.just("alex");
    }

    public static void main(String[] args){
        FluxAndMonoGeneratorService fluxAndMonoGeneratorService = new FluxAndMonoGeneratorService();
        fluxAndMonoGeneratorService.nameFlux()
                .subscribe(name -> {
                    System.out.println("Name is : " + name);
                });

        fluxAndMonoGeneratorService.nameMono()
                .subscribe(name -> {
                    System.out.println("Name is : " + name);
                });
    }
}
