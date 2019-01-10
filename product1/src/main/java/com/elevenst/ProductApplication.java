package com.elevenst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
  -- How to Test 2. Triggering via config server  --

    1. Modify and commit configuration file
    https://github.com/Justin-ad-Park/spring-cloud-config-repo/blob/master/client-service-zone1.yml

    2. Call command as below
    curl -H "X-Github-Event: push" -H "Content-Type: application/json" -X POST -d '{"commits": [{"modified": ["product-api1.yml"]}]}' http://localhost:8889/monitor
*/
@SpringBootApplication
@EnableDiscoveryClient
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class);
    }
}
