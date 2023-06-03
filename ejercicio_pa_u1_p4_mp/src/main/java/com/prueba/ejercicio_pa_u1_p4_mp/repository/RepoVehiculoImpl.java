package com.prueba.ejercicio_pa_u1_p4_mp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prueba.ejercicio_pa_u1_p4_mp.model.Vehiculo;

@Repository
public class RepoVehiculoImpl implements RepoVehiculo{

    @Autowired
    private static ArrayList<Vehiculo> mockBase;

    @Override
    public void insertarVehiculo(Vehiculo vehiculo) {
        mockBase.add( vehiculo);
    }

    @Override
    public Vehiculo leerVehiculoPorPlaca(String placa) {
        
        Vehiculo match = null;
        for(Vehiculo v: mockBase){
            if (v.getPlaca().equals(placa)){
                match = v;
            }
        }

        return  match;
    }

    @Override
    public void actualizarVehiculo(Vehiculo vehiculo) {

        for(Vehiculo v: mockBase){
            if (v.getPlaca().equals(vehiculo.getPlaca())){
                mockBase.remove(v);
                mockBase.add( v);
            }
        }
        
    }

    @Override
    public void borrarVehiculo(Vehiculo vehiculo) {
       mockBase.remove(vehiculo);
    }

    @Override
    public List<Vehiculo> leerTodo() {
       return mockBase;
    }

    

}
