package com.example.demo;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WordService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "wordError")
    public String[] wordService(String start, String end) {
        return restTemplate.getForObject("http://SERVICE-WORDLADDER/wordLadder?start=" + start
                                        + "&end=" + end, String[].class);
    }

    public String[] wordError(String start, String end) {
        return new String[]{"Sorry, it seems that we can't provide this service now"};
    }
}