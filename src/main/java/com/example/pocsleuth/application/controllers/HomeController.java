package com.example.pocsleuth.application.controllers;

import com.example.pocsleuth.infrastructure.integration.config.TestClient;
import com.example.pocsleuth.infrastructure.integration.data.ClientResponse;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/poc-sleuth")
public class HomeController {

  private final Logger logger;
  private final TestClient client;

  public HomeController(final Logger logger, final TestClient client) {
    this.logger = logger;
    this.client = client;
  }

  @GetMapping
  public ResponseEntity<ClientResponse> home() {
    logger.info("Hello, Sleuth!");
    final ClientResponse response = client.get();
    logger.info("Response: {}", response);
    return ResponseEntity.ok(response);
  }

}
