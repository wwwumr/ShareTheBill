package com.example.servicefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    @Autowired
    ScheduleServiceWordLadder scheduleServiceWordLadder;
    @RequestMapping(value = "/wordladder",method = RequestMethod.GET)
    public String getWords(@RequestParam String start, @RequestParam String end){
        return scheduleServiceWordLadder.getWordLadder(start, end);
    }
}