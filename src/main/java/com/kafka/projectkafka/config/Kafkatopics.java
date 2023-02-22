package com.kafka.projectkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Kafkatopics {
	@Bean
	public NewTopic getKafkaTopic() {
		
		return TopicBuilder.name("vannatopic1").build();
	}
	
	@Bean
	public NewTopic getJsonKafka() {
		return TopicBuilder.name("jsontopic").build();
	}

}
