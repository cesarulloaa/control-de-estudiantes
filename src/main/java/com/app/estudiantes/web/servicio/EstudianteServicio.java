package com.app.estudiantes.web.servicio;

import com.app.estudiantes.web.entidad.Estudiante;

import java.util.List;

public interface EstudianteServicio {
    public List<Estudiante> listarTodos();
    public Estudiante guardarEstudiante(Estudiante estudiante);
    public Estudiante obtenerEstudiantePorId(Long id);
    public Estudiante actualizarEstudiante(Estudiante estudiante);
    public void eliminarEstudiante(Long id);
}
