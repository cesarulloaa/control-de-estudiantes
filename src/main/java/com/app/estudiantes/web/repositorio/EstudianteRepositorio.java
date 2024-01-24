package com.app.estudiantes.web.repositorio;

import com.app.estudiantes.web.entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante,Long> {

}
