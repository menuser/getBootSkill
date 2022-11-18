package com.rockheart.demo.ctrl;

import com.rockheart.demo.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RequestMapping("/getBootSkill")
@Controller
public class GetBootSkillCtrl {

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

    @RequestMapping("/study")
    public String study(Map<String, Object> map, HttpServletRequest request) {
        List<User> userList = new ArrayList<User>();
        userList.add(new User("小梦", 1));
        userList.add(new User("小李", 2));
        userList.add(new User("小张", 1));
        map.put("userList", userList);

        // 1女, 2男
        map.put("sex", 1);
        map.put("man", 2);
        // th:text th:utext
        map.put("desc", "欢迎来到<h1>RockHeart<h1>");

        request.getSession().setAttribute("user", new User("小不点", 2));

        return "study";
    }




}
