package com.prueba.ejercicio_pa_u1_p4_mp.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@Builder
@ToString

public class Propietario {

    private String nombre;
    private String apellido;
    private String identificacion;
    private LocalDate fechaNacimiento;
    
}
