package com.crmeeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ssk
 * on 2018/7/24.
 */
//   隐私政策
    @Controller
public class PrivacyController {
        @RequestMapping("/privacy")
        public String privacy(){
            return "privacy";
        }
}
