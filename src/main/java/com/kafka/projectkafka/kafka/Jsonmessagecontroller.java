package com.kafka.projectkafka.kafka;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.projectkafka.payload.User;

@RestController
public class Jsonmessagecontroller {
	
	
	Jsonkafkaproducer jsonkafkaproducer;
	
	
	public ResponseEntity<?> getJson(@RequestBody User user){
		jsonkafkaproducer.sendMessage(user);
		return new ResponseEntity<>("Sucessfull ",HttpStatus.OK);
		
	}
	
	

}
