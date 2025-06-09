package com.apicrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Informe o nome do produto.")
    private String nome;

    @NotNull(message = "Informe o preço do produto.")
    @PositiveOrZero(message = "O preço deve ser zero ou positivo.")
    private Double preco;

    @NotNull(message = "Informe a quantidade disponível do produto.")
    @Min(value = 0, message = "A quantidade deve ser zero ou maior.")
    private Integer quantidade;
}