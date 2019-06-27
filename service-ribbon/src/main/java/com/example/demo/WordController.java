package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    @Autowired
    WordService wordService;

    @RequestMapping(value = "/wordladder")
    public String getWords(@RequestParam String start, @RequestParam String end){
        return wordService.wordService(start, end);
    }
}