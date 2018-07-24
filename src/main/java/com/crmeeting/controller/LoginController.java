package com.crmeeting.controller;
/**
 * Created by ssk
 * on 2018/7/23.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LoginController {
    //    启动login.html
    @RequestMapping("/login")
    public  String login(){
        return("login");
    }
}
