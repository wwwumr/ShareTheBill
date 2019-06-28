package moe.cnkirito.security.oauth2.code.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 徐靖峰[OF2938]
 * company qianmi.com
 * Date 2018-04-25
 */
@RestController
@RequestMapping("/user")
public class QQRestfulApiProviderController {
    @Autowired
    AuthService authService;
    @RequestMapping("/wordLadder/{start}/{end}")
    public String [] info(@PathVariable(value = "start") String start, @PathVariable(value="end")String end){
        System.out.println(start);
        return authService.wordLadder(start,end);
    }

}

