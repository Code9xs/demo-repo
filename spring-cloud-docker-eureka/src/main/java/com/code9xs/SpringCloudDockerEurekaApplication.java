package com.code9xs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudDockerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDockerEurekaApplication.class, args);
    }

}
