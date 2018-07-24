package com.crmeeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ssk
 * on 2018/7/24.
 */
//   个人中心
    @Controller
public class PersonalCenterController {
        @RequestMapping("/personal-center")
        public  String personalcenter(){
            return "personal-center";
        }
}
