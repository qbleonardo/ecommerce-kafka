package com.ecommerce.ecommercekafka.external.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ConsumerProduct {

    @KafkaListener(id = "ecommerce", topics = {"products"}, groupId = "ecommerce-groupId")
    public void listenKafka(Object object){
        log.info("Produto recebido {}", object);
    }
}
