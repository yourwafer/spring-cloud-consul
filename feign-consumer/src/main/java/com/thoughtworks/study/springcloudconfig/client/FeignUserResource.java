package com.thoughtworks.study.springcloudconfig.client;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "consul-java-service", fallback = FeignUserResourceFallback.class)
public interface FeignUserResource extends UserResource {
}
