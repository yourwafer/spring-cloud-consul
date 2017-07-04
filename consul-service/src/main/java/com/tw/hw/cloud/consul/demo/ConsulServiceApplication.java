package com.tw.hw.cloud.consul.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@RestController
public class ConsulServiceApplication {

  @RequestMapping("/")
  public String home() {
    return "Hello World, I'm Consul service";
  }


  public static void main(String[] args) {
    SpringApplication.run(ConsulServiceApplication.class, args);
  }

}