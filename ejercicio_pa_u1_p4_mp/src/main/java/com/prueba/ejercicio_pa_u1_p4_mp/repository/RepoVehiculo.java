package com.prueba.ejercicio_pa_u1_p4_mp.repository;

import java.util.List;

import com.prueba.ejercicio_pa_u1_p4_mp.model.Vehiculo;

public interface RepoVehiculo {
    
    public void insertarVehiculo(Vehiculo vehiculo);
    public Vehiculo leerVehiculoPorPlaca(String placa);
    public void actualizarVehiculo(Vehiculo vehiculo);
    public void borrarVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> leerTodo();


}
