package com.prueba.model;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString



public class Vehiculo {
    private String marca;
    private String placa;
    private String modelo;
    private BigDecimal precio;
    private char tipo;
}
