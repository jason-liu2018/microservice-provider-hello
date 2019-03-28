package com.lmstudio.cloud.provider.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceProviderHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderHelloApplication.class, args);
    }

}
