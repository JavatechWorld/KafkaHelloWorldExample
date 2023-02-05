
package com.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "TestTopic", groupId = "groupId")
	public void listenToCodeDecodeKafkaTopic(String messageReceived) {
		System.out.println("Hi I am a Consumer and have read this : " + messageReceived);
	}
}
