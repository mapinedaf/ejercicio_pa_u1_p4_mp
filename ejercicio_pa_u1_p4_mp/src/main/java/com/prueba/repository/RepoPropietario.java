package com.prueba.repository;

import java.util.List;

import com.prueba.model.Propietario;

public interface RepoPropietario {
    public void insertarPropietario(Propietario propietario);
    public void borrarPropietario(Propietario propietario);
    public Propietario leerPropietarioPorId(String id);

    public List<Propietario> leerTodo();
}
