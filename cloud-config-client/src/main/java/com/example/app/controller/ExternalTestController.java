package com.example.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RefreshScope
public class ExternalTestController {
	@Value("${error.code}")
	private String errorCode;
	
	@GetMapping("/code")
	public String getCode() {
		log.info("Getting code");
		return errorCode;
	}
}
