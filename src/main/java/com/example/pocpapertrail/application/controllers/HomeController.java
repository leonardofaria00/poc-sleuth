package com.example.pocpapertrail.application.controllers;

import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/poc-papertrail")
public class HomeController {


  private final Logger logger;

  public HomeController(final Logger logger) {
    this.logger = logger;
  }

  @GetMapping
  public ResponseEntity<String> home() {
    logger.info("Hello, Papertrail!");
    return ResponseEntity.ok("Hello, Papertrail!");
  }

}
