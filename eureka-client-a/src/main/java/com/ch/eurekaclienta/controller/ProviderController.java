package com.ch.eurekaclienta.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenhong
 * @version 1.0.0
 * @ClassName ProviderController.java
 * @Description TODO
 * @createTime 2022年10月10日 10:38:00
 */
@RestController
public class ProviderController {

    @GetMapping("/getA")
    public String GetServiceA(){
        return "提供了A服务";
    }
}
