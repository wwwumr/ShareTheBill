package com.example.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-wordladder",fallback =  ScheduleServiceWordHystrix.class)
public interface ScheduleServiceWordLadder {

    @RequestMapping(value = "/wordladder",method = RequestMethod.GET)
    String[] getWordLadder(@RequestParam(value = "start") String start, 
                            @RequestParam(value = "end") String end);
}