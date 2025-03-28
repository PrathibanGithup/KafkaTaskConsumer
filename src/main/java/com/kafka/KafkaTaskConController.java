package com.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getmsg")
public class KafkaTaskConController {

	@Autowired
	KafkaTaskConsumer kc;

	@GetMapping(value = "/getAll")
	public String getmsg() {
		return kc.getAllmsg();

	}

}
