package com.prueba.repository;

import java.util.List;

import com.prueba.model.Vehiculo;

public interface RepoVehiculo {
    
    public void insertarVehiculo(Vehiculo vehiculo);
    public Vehiculo leerVehiculoPorPlaca(String placa);
    public void actualizarVehiculo(Vehiculo vehiculo);
    public void borrarVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> leerTodo();


}
