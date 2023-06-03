package com.prueba.repository;

import java.util.List;

import com.prueba.model.Matricula;

public interface RepoMatricula {
    
    public void insertarMatricula(Matricula matricula);
    public Matricula leerMatriculaPorId(String identificacion);

    public void borrarMatricula(Matricula matricula);

    public List<Matricula> leerTodo();
    
}
