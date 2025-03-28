package com.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class KafkaTaskConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaTaskConsumerApplication.class, args);
	}

}
