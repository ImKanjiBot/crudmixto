// src/main/java/com/miaplicacion/crudmixto/controller/ProyectoController.java
package com.miaplicacion.crudmixto.controller;

import com.miaplicacion.crudmixto.model.Proyecto;
import com.miaplicacion.crudmixto.service.ProyectoService;

import jakarta.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/proyectos")
public class ProyectoController {
    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("proyectos", proyectoService.listar());
        return "proyectos/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("proyecto", new Proyecto());
        return "proyectos/form";
    }

    @PostMapping
    @Transactional
    public String guardar(@ModelAttribute Proyecto proyecto) {
        proyectoService.guardar(proyecto); // Corregí "guarder" y la barra
        return "redirect:/proyectos";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable String id, Model model) {
        model.addAttribute("proyecto", proyectoService.buscarPorId(id));
        return "proyectos/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable String id) {
        proyectoService.eliminar(id);
        return "redirect:/proyectos";
    }
}
