package com.example.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceWordHystrix implements ScheduleServiceWordLadder {
    
    @Override
    public String[] getWordLadder(String start, String end) {
        return new String[]{"Sorry, it seems that we can't provide this service now!"};
    }
}