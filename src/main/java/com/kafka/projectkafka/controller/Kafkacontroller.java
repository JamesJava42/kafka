package com.kafka.projectkafka.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.projectkafka.kafka.Kafkaproducer;

@RestController
public class Kafkacontroller {
	Kafkaproducer kafkaproducer;
	
	
	@PostMapping("/publish")
	public ResponseEntity<?> publicMessage(@RequestParam("message") String message){
		kafkaproducer.sendMessage(message);
		return new ResponseEntity<>("Message Send Succesfully",HttpStatus.OK);
		
	}

}
