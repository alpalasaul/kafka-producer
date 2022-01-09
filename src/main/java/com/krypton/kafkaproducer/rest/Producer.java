package com.krypton.kafkaproducer.rest;

import com.krypton.kafkaproducer.model.NewsPaper;
import com.krypton.kafkaproducer.model.User;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("kafka")
public class Producer {

    @Autowired
    KafkaTemplate<String, NewsPaper> kafkaTemplate;

    private static final String TOPIC = "Kafka_Example";

    @GetMapping("/publish/{name}/{date}")
    public String post(@PathVariable("name") String name, @PathVariable("date") String date) {
        kafkaTemplate.send(TOPIC, new NewsPaper(name, LocalDate.parse(date)));
        return "Published in Kafka";
    }


}
