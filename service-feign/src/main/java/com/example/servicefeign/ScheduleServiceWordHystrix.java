package com.example.servicefeign;

import org.springframework.stereotype.Component;

@Component
public class ScheduleServiceWordHystrix implements ScheduleServiceWordLadder {
    
    @Override
    public String excepWords(String name) {
        return "Sorry, it seems that we can't provide this service now!";
    }
}