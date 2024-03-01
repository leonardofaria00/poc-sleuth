package com.example.pocsleuth.infrastructure.integration.config;

import com.example.pocsleuth.infrastructure.integration.data.ClientResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "test", url = "http://localhost:3001")
public interface TestClient {

  @GetMapping(value = "/api-client")
  ClientResponse get();
}
