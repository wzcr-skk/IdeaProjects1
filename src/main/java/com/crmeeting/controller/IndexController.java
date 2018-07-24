package com.crmeeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ssk
 * on 2018/7/24.
 */
//启动视频会议系统界面
    @Controller
public class IndexController {
        @RequestMapping("/index")
        public String index(){
            return "index";
        }
}
