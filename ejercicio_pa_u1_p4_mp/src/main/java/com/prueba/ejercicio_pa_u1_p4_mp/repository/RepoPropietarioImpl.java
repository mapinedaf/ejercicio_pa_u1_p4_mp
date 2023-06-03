package com.prueba.ejercicio_pa_u1_p4_mp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prueba.ejercicio_pa_u1_p4_mp.model.Propietario;

@Repository
public class RepoPropietarioImpl implements RepoPropietario{


    @Autowired
    private static ArrayList<Propietario> mockBase;

    @Override
    public void insertarPropietario(Propietario propietario) {
        mockBase.add(propietario);
    }

    @Override
    public void borrarPropietario(Propietario propietario) {
        mockBase.remove(propietario);
    }

    @Override
    public List<Propietario> leerTodo() {
        return mockBase;
    }

    @Override
    public Propietario leerPropietarioPorId(String id) {
        Propietario match = null;
        for(Propietario v: mockBase){
            if (v.getIdentificacion().equals(id)){
                match = v;
            }
        }

        return  match;
    }


  
}
