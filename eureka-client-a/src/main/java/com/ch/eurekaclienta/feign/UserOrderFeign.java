package com.ch.eurekaclienta.feign;

import com.ch.eurekaclienta.feign.hystrix.UserOrderFeignHystrix;
import com.ch.eurekaclientb.entity.Food;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chenhong
 * @version 1.0.0
 * @ClassName UserOrderFeign.java
 * @Description TODO
 * @createTime 2022年10月11日 16:54:00
 */
@FeignClient(value = "eureka-client-b",fallback = UserOrderFeignHystrix.class)
public interface UserOrderFeign {
    @GetMapping("/getFood")
    public Food getFood();
}
