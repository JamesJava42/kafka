package com.kafka.projectkafka.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.kafka.projectkafka.payload.User;

@Service
public class Jsonkafkaproducer {
	
	//deserilizing so mention in properties to Json
	
	KafkaTemplate<String, User>  kafkaTemplate;

	public Jsonkafkaproducer(KafkaTemplate<String, User> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	
	public void sendMessage(User data) {
	  Message<User>	message = MessageBuilder.withPayload(data).setHeader(KafkaHeaders.TOPIC, "vannagroup1").build();
	  kafkaTemplate.send(message);
	}

}
