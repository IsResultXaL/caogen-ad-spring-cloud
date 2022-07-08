package com.caogen.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author 康良玉
 * @Description 描述
 * @Create 2022-07-08 10:40
 */
@EnableEurekaClient
@SpringBootApplication
public class BinlogKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BinlogKafkaApplication.class, args);
    }

}
