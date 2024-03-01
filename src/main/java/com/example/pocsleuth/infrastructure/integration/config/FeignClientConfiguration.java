package com.example.pocsleuth.infrastructure.integration.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients("com.example.pocsleuth")
public class FeignClientConfiguration {

}
