package com.ch.eurekaclientb.controller;

import com.ch.eurekaclientb.entity.Food;
import org.apache.tomcat.jni.Time;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenhong
 * @version 1.0.0
 * @ClassName FoodProviderController.java
 * @Description TODO
 * @createTime 2022年10月11日 16:47:00
 */
@RestController
public class FoodProviderController {

    @GetMapping("/getFood")
    public Food getFood(){
        Food food = new Food();
        food.setName("包子");
        food.setPrice("100$");
        return food;
    }
}
