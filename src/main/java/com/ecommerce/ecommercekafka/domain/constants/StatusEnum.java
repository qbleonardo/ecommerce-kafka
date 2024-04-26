package com.ecommerce.ecommercekafka.domain.constants;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum StatusEnum {

    PENDENTE("pendente"),
    ACEITO("aceito"),
    ENVIADO("enviado"),
    ENTREGUE("entregue");


    private final String value;
}
