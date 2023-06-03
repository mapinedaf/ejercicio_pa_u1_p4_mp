package com.prueba.ejercicio_pa_u1_p4_mp.repository;

import java.util.List;

import com.prueba.ejercicio_pa_u1_p4_mp.model.Matricula;

public interface RepoMatricula {
    
    public void insertarMatricula(Matricula matricula);
    public Matricula leerMatriculaPorId(String identificacion);

    public void borrarMatricula(Matricula matricula);

    public List<Matricula> leerTodo();
    
}
