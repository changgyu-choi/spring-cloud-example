package com.example.oneapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OneApiController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/one")
    public String hello() {
        return restTemplate.getForObject("http://two-api-svc:8080/two", String.class);
    }
}
