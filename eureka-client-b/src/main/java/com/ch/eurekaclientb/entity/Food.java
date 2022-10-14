package com.ch.eurekaclientb.entity;

import org.springframework.stereotype.Component;

/**
 * @author chenhong
 * @version 1.0.0
 * @ClassName food.java
 * @Description TODO
 * @createTime 2022年10月11日 16:48:00
 */

@Component
public class Food {
    private String name;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
