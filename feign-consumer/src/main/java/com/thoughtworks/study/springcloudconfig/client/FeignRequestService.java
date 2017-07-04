package com.thoughtworks.study.springcloudconfig.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("consul-java-service")
public interface FeignRequestService {

    @GetMapping("/")
    public String rquestHello();
}
