package com.rockheart.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@RequestMapping("/getBootSkill")
@Controller
public class getBootSkillHello {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world!";
    }

    @RequestMapping("/execute")
    public String execute(Map<String, Object> map) {
        map.put("name", "shixin");
        return "success";
    }


}
