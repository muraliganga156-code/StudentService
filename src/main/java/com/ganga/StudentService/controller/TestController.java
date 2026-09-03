package com.ganga.StudentService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@CrossOrigin("*")
public class TestController {
    @GetMapping("/Hello")
    public ResponseEntity<?> Hello(){
        return new ResponseEntity("Hello", HttpStatus.OK);
    }
}

