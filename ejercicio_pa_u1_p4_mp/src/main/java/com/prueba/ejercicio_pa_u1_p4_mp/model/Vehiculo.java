package com.prueba.ejercicio_pa_u1_p4_mp.model;

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
