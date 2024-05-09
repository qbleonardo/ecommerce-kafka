package com.ecommerce.ecommercekafka;

import com.ecommerce.ecommercekafka.domain.Produto;
import com.ecommerce.ecommercekafka.external.producer.ProducerProduct;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

import java.math.BigDecimal;

@EnableKafka
@AllArgsConstructor
@SpringBootApplication
public class EcommerceKafkaApplication implements CommandLineRunner {

    private ProducerProduct producerProduct;

    public static void main(String[] args) {
        SpringApplication.run(EcommerceKafkaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Produto produto = Produto.builder()
                .nomeProduto("Celular")
                .preco(BigDecimal.valueOf(100L))
                .qtdEstoque(2)
                .build();
        producerProduct.sendToKafka("products", produto.toString());
    }
}
