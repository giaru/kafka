package de.hsReutlingen.Kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class ThermometerController
{
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping(path = "/send/temperatures/{msg}")
    public String sendMessage( @PathVariable("msg") String message )
    {
        this.kafkaTemplate.send("temperature", message);
        return "Erfolgreich versendet";
    }

}
