package com.prueba.ejercicio_pa_u1_p4_mp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prueba.ejercicio_pa_u1_p4_mp.model.Matricula;

@Repository
public class RepoMatriculaImpl implements RepoMatricula{

    @Autowired
    private static ArrayList<Matricula> mockBase = new ArrayList<>();

    @Override
    public void insertarMatricula(Matricula matricula) {
        mockBase.add( matricula);
    }

    @Override
    public Matricula leerMatriculaPorId(String identificacion) {
        Matricula match = null;
        for (Matricula m : mockBase){
            if (m.getPropietario().getIdentificacion().equals(match)){
                match = m ; 
            }
        }

        return match;
    }

    @Override
    public void borrarMatricula(Matricula matricula) {
        mockBase.remove(matricula);
    }

    @Override
    public List<Matricula> leerTodo() {
       return mockBase;
    }
    
}
