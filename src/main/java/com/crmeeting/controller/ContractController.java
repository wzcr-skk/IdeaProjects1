package com.crmeeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ssk
 * on 2018/7/24.
 */
//  服务协议
    @Controller
public class ContractController {
        @RequestMapping("/contract")
        public String contract(){
            return "contract";
        }
}
