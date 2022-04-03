package com.unufolio.vaccin.advertisement.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;

@Controller("/advertisements")
public class AdvertisementController {

//    @Inject
//    private GreetingService greetingService;

    @Get("/{id}")
    public String greet(String id) {
        return id;
    }

//    @Post(value = "/{name}", consumes = MediaType.APPLICATION_JSON)
//    public String setGreeting(@Body String name) {
//        return greetingService.getGreeting() + name;
//    }
}