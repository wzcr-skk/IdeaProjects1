package com.crmeeting.controller;

import com.crmeeting.service.UseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: zhao quan
 * @Date: 2018/7/23 11:59
 * @PACKAGE_NAME: com.crmeeting.controller
 * @Description:
 */
@Controller
public class TestController {
    @Autowired

    @RequestMapping("/test")
    public String re(){
        return "index";
    }
}
