package moe.cnkirito.security.oauth2.code.endpoint;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-wordladder")
public interface AuthService {
    @RequestMapping(value = "/wordLadder",method = RequestMethod.GET)
    String[] wordLadder(@RequestParam(value = "start") String start,@RequestParam(value="end")String end);
}