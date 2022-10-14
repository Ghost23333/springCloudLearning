package com.ch.eurekaclientb.controller;

import org.apache.http.HttpRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

/**
 * @author chenhong
 * @version 1.0.0
 * @ClassName PorviderController.java
 * @Description TODO
 * @createTime 2022年10月10日 10:45:00
 */

@RestController
public class PorviderController {
    @Value("${server.port}")
    private int serverPort;
    @GetMapping("/getB")
    public String GetServiceB(){

        System.out.println(serverPort);
        return serverPort + "提供了B服务";
    }

}
