package com.ecommerce.ecommercekafka.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Produto {

    private String nomeProduto;
    private BigDecimal preco;
    private Integer qtdEstoque;

}
