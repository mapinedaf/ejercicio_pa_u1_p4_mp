package com.prueba.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@Builder
@ToString


public class Matricula {

    private LocalDate fecha;
    private BigDecimal valorMatricula;
    private Propietario propietario;
    private Vehiculo vehiculo;
    
}
