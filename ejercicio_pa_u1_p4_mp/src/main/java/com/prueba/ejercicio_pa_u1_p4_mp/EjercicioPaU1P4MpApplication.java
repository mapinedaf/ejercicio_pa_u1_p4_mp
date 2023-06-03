package com.prueba.ejercicio_pa_u1_p4_mp;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prueba.model.Propietario;
import com.prueba.model.Vehiculo;
import com.prueba.service.ServiceMatriculaImpl;

@SpringBootApplication
public class EjercicioPaU1P4MpApplication implements CommandLineRunner {
	
	@Autowired
	ServiceMatriculaImpl serviceMatriculaImpl;


	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P4MpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		System.err.println("Prueba 1 ");

		//Crear un vehiculo 

		Vehiculo vehiculo = Vehiculo.builder()
			.marca("toyota")
			.placa("1234")
			.modelo("corolla")
			.precio(BigDecimal.valueOf(500))
			.tipo('A')
			.build();

		serviceMatriculaImpl.crearVehiculo(vehiculo);

		vehiculo.setPrecio(BigDecimal.valueOf(620));
		vehiculo.setTipo('m');

		serviceMatriculaImpl.actualizarVehiculo(vehiculo);

		Propietario propietario = Propietario.builder()
			.nombre("jose")
			.apellido("lara")
			.identificacion("1253")
			.fechaNacimiento(LocalDate.now())
			.build();


			serviceMatriculaImpl.crearPropietario(propietario);

			serviceMatriculaImpl.CrearMatricula(propietario.getIdentificacion(), vehiculo.getPlaca());

			serviceMatriculaImpl.leerTodo().stream().forEach(System.out::println);
	}	


}
