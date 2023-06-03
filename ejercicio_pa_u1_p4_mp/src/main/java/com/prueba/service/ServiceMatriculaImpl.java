package com.prueba.service;

import java.beans.JavaBean;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.model.Matricula;
import com.prueba.model.Propietario;
import com.prueba.model.Vehiculo;
import com.prueba.repository.RepoMatricula;
import com.prueba.repository.RepoPropietario;
import com.prueba.repository.RepoVehiculo;


@Service
public class ServiceMatriculaImpl implements ServiceMatricula{

    @Autowired 
    RepoPropietario repoPropietario;

    @Autowired 
    RepoMatricula repoMatricula;

    @Autowired
    RepoVehiculo repoVehiculo;



    @Override
    public void CrearMatricula(String id, String placa) {
        
        Propietario propietario = repoPropietario.leerPropietarioPorId(id);
        Vehiculo vehiculo = repoVehiculo.leerVehiculoPorPlaca(placa);
        BigDecimal mult = new BigDecimal(0);
        BigDecimal descuento = new BigDecimal(0.91);
        switch(vehiculo.getTipo()){

            case 'a':
            case 'A':
                mult = new BigDecimal(0.15);
            break;

            case 'M':
            case 'm':
                mult = new BigDecimal(0.10);
            break;
            
            
        }

        
        BigDecimal total = vehiculo.getPrecio().multiply(mult);

        if(total.compareTo(BigDecimal.valueOf(3000))==1)
        {
            total = total.multiply(descuento);
        }
        
        Matricula matricula = Matricula.builder()
                .fecha(LocalDate.now())
                .valorMatricula(total)
                .propietario(propietario)
                .vehiculo(vehiculo)
                .build();
        
        repoMatricula.insertarMatricula(matricula);
    }

    @Override
    public Matricula BuscarMatriculaPorId(String identificacion) {
        return repoMatricula.leerMatriculaPorId(identificacion);
    }

    @Override
    public void EliminarMatricula(Matricula matricula) {
        repoMatricula.borrarMatricula(matricula);
    }

    @Override
    public List<Matricula> leerTodo() {
        return repoMatricula.leerTodo();
    }

    @Override
    public void crearPropietario(Propietario propietario) {
        repoPropietario.insertarPropietario(propietario);
    }

    @Override
    public void crearVehiculo(Vehiculo vehiculo) {
        repoVehiculo.insertarVehiculo(vehiculo);
    }
    

    public void actualizarVehiculo(Vehiculo vehiculo) {
        repoVehiculo.actualizarVehiculo(vehiculo);
    }
}
