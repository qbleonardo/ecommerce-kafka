package com.ecommerce.ecommercekafka.external.producer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ProducerProduct {

    public ProducerProduct(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void sendToKafka(String topic, String data){
        kafkaTemplate.send(topic, data);
        log.info("Enviado ao topic: {}", topic);
    }
}
