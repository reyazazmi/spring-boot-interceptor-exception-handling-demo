package com.nc.controller;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
@Slf4j
@RestController
@RequestMapping("/api/")
public class helloController {

    @GetMapping("/hello")
    public String hello() {
        log.info("inside hello world");
        return "Hii there!!!";
    }

    @PostMapping("/hello")
    public ResponseEntity<String> hello(HttpServletRequest request, @RequestBody JsonNode reqNode){
        return new ResponseEntity<>("{\"responseCode\":\"200\", \"responseMessage\":\"OK\"}",HttpStatus.OK);
    }
}
