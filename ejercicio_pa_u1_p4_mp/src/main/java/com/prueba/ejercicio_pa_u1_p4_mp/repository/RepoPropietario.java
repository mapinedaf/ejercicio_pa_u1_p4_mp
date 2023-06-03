package com.prueba.ejercicio_pa_u1_p4_mp.repository;

import java.util.List;

import com.prueba.ejercicio_pa_u1_p4_mp.model.Propietario;

public interface RepoPropietario {
    public void insertarPropietario(Propietario propietario);
    public void borrarPropietario(Propietario propietario);
    public Propietario leerPropietarioPorId(String id);

    public List<Propietario> leerTodo();
}
