package com.ch.eurekaclienta.controller;

import com.ch.eurekaclienta.feign.UserOrderFeign;
import com.ch.eurekaclientb.entity.Food;
import jdk.internal.org.objectweb.asm.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author chenhong
 * @version 1.0.0
 * @ClassName UserOrderController.java
 * @Description TODO
 * @createTime 2022年10月11日 16:53:00
 */
@RestController
public class UserOrderController {

    @Resource
    private UserOrderFeign userOrderFeign;

    @GetMapping("/order")
    public String doOrder() {
        Food food = userOrderFeign.getFood();
        return food.toString();
    }

}
