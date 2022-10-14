package com.ch.eurekaclienta.feign.hystrix;

import com.ch.eurekaclienta.feign.UserOrderFeign;
import com.ch.eurekaclientb.entity.Food;
import org.springframework.stereotype.Component;

/**
 * @author chenhong
 * @version 1.0.0
 * @ClassName UserOrderFeignHystrix.java
 * @Description TODO
 * @createTime 2022年10月14日 14:59:00
 */
@Component
public class UserOrderFeignHystrix implements UserOrderFeign {
    @Override
    public Food getFood() {
        System.out.println("这是一个备胎");
        Food food = new Food();
        food.setName("草草草草");
        food.setPrice("10000000$");
        return  food;
    }
}
