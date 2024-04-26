package com.ecommerce.ecommercekafka.domain;

import com.ecommerce.ecommercekafka.domain.constants.StatusEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pedido {

    private String dataSolicitacao;
    private StatusEnum status;

    private Integer quantidade;
}
