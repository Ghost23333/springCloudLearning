package com.ch.eurekaclienta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Locale;

/**
 * @author chenhong
 * @version 1.0.0
 * @ClassName DiscoverController.java
 * @Description TODO
 * @createTime 2022年10月08日 20:04:00
 */
@RestController
public class DiscoverController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;

//    发现服务
    @GetMapping("/discover")
    public String doDiscovery(String serviceName){
        String url = "http://" + serviceName+"/getB";
        System.out.println(url);
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);


        return response.getBody().toString();
    }

    @GetMapping("/testB")
    public String getB(){
        String url = "http://localhost:8081/getB";
        return restTemplate.getForObject(url,String.class);
    }

}
