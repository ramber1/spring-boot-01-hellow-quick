package com.assgg.springboot01hellowquick.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellow {

    @Value("${person.lastname}")
    private String name;
    @RequestMapping("/hellow")
    public String responseHellow(){
        return  "hellow world! 我爱你！";
    }
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello ,"+name;
    }
}
