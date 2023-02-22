package com.kafka.projectkafka.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Kafkaproducer {
	
	
	private KafkaTemplate<String, String> kafkaTemplate;

	public Kafkaproducer(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String message) {
		kafkaTemplate.send("vannatopic1", message);
		
	}

}
