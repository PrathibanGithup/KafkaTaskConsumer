package com.kafka;

import java.util.ArrayList;
import java.util.List;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaTaskConsumer {

	List<String> results = new ArrayList<>();

	@KafkaListener(topics = "kafkatasktopic", groupId = "Kafka-consumer1")

	public void recieveMessage(String msg) {
		addMessage(msg);
	}

	public void addMessage(String m) {
		results.add(m);
	}

	public String getAllmsg() {
		return results.toString();
	}

}
