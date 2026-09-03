package com.ganga.StudentService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
@CrossOrigin("*")
public class TestController {
    @GetMapping("/students")
    public ResponseEntity<?>getStudents(){
        Map<String,Integer> students=new HashMap<>();
        students.put("Hari",22);
        students.put("Giri",32);
        students.put("Siri",24);
        students.put("Jari",22);
        students.put("Pari",25);
        return new ResponseEntity<>(students,HttpStatus.OK);
    }
};

