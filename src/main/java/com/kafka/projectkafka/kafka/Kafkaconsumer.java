package com.kafka.projectkafka.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.projectkafka.payload.User;

@Service
public class Kafkaconsumer {
	
	@KafkaListener(topics = "vannagroup1",groupId = "mygroup")
   public void getMessage(String message) {
	   System.out.println("kafka consumers data"+message);
	   
   }
	
	@KafkaListener(topics = "jsontopic" , groupId = "mygroup")
	public void getJsonMessage(User user) {
		System.out.println("user json format "+user);
	}

}
