package com.app.estudiantes.web.controlador;

import com.app.estudiantes.web.entidad.Estudiante;
import com.app.estudiantes.web.servicio.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstudianteControlador {
    @Autowired
    private EstudianteServicio servicio;

    @GetMapping({"/estudiantes", "/"})
    public String listarEstudiantes(Model model){
        model.addAttribute("estudiantes", servicio.listarTodos()); // Cambiado a "estudiantes"
        return "index"; //nos retorna al archivo estudiantes
    }

    @GetMapping("/estudiantes/nuevo")
    public String mostrarFormulario(Model model) {
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudiante);
        return "crear_estudiante";

    }

    @PostMapping("/estudiantes")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante){
        servicio.guardarEstudiante(estudiante);
        return "redirect:/index";
    }

    @GetMapping("/estudiantes/editar/{id}")
    public String mostrarFormulario(@PathVariable Long id, Model model){
        model.addAttribute("estudiante", servicio.obtenerEstudiantePorId(id));
        return "editar_estudiantes";
    }

    @PostMapping("/estudiantes/{id}")
    public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("estudiante") Estudiante estudiante, Model model){
        Estudiante estudianteExistente = servicio.obtenerEstudiantePorId(id);
        estudianteExistente.setId(id);
        estudianteExistente.setNombre(estudiante.getNombre());
        estudianteExistente.setApellido(estudiante.getApellido());
        estudianteExistente.setEmail(estudiante.getEmail());

        servicio.actualizarEstudiante(estudianteExistente);
        return "redirect:/index";
    }

    @GetMapping("/estudiantes/{id}")
    public String eliminarEstudiantes(@PathVariable Long id){
        servicio.eliminarEstudiante(id);
        return "redirect:/index";
    }
}
