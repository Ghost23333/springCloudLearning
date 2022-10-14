package com.ch.eurekaclienta;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class EurekaClientAApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testB(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/discover?serviceName=eureka-client-b";
        String res = restTemplate.getForObject(url,String.class);
        System.out.println(res);
    }

}
