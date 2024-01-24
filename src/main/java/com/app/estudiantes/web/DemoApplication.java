package com.app.estudiantes.web;

import com.app.estudiantes.web.entidad.Estudiante;
import com.app.estudiantes.web.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private EstudianteRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		/*
		Estudiante estudiante1 = new Estudiante("Cesar", "Ulloa", "cesarulloa@mail.com");
		repositorio.save(estudiante1);
		Estudiante estudiante2 = new Estudiante("Andres", "Castro", "ac20@mail.com");
		repositorio.save(estudiante2);


		Estudiante estudiante3 = new Estudiante("Ximena", "Kish", "kittyxk@mail.com");
		repositorio.save(estudiante3);

		 */
	}
}
