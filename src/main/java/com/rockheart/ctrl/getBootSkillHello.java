package com.rockheart.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/getBootSkill")
@Controller
public class getBootSkillHello {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world!";
    }


}
