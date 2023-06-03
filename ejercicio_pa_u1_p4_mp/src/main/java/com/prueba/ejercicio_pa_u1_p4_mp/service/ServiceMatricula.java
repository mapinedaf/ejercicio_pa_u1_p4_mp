package com.prueba.ejercicio_pa_u1_p4_mp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.prueba.ejercicio_pa_u1_p4_mp.model.Matricula;
import com.prueba.ejercicio_pa_u1_p4_mp.model.Propietario;
import com.prueba.ejercicio_pa_u1_p4_mp.model.Vehiculo;

@Service
public interface ServiceMatricula {
    public void CrearMatricula(String id, String placa);
    public Matricula BuscarMatriculaPorId(String identificacion);
    public void EliminarMatricula(Matricula matricula);
    public List<Matricula> leerTodo();


    public void crearPropietario(Propietario propietario);
    public void crearVehiculo(Vehiculo vehiculo);



    public void actualizarVehiculo(Vehiculo vehiculo);


}
