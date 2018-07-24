package com.crmeeting.controller;
/**
 * Created by ssk
 * on 2018/7/23.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class RegisteredController {
    // 启动注册页面
    @RequestMapping("/registered")
    public String registered(){
        return ("registered");
    }
}
