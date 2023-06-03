package com.prueba.service;

import java.util.List;

import com.prueba.model.Matricula;
import com.prueba.model.Propietario;
import com.prueba.model.Vehiculo;

public interface ServiceMatricula {
    public void CrearMatricula(String id, String placa);
    public Matricula BuscarMatriculaPorId(String identificacion);
    public void EliminarMatricula(Matricula matricula);
    public List<Matricula> leerTodo();


    public void crearPropietario(Propietario propietario);
    public void crearVehiculo(Vehiculo vehiculo);



    public void actualizarVehiculo(Vehiculo vehiculo);


}
