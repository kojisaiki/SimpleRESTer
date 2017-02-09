package com.example.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by koji on 2017/02/09.
 */
@RestController
@RequestMapping("/api")
public class HelloResource {

    @RequestMapping("/hello")
    public ResponseEntity hello() {
        return ResponseEntity.ok("hello!yahoo!");
    }

}
