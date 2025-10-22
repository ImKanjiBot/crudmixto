// src/main/java/com/miaplicacion/crudmixto/service/ProyectoService.java
package com.miaplicacion.crudmixto.service;

import com.miaplicacion.crudmixto.model.Proyecto;
import com.miaplicacion.crudmixto.repository.ProyectoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService {

    private final ProyectoRepository proyectoRepo;

    public ProyectoService(ProyectoRepository proyectoRepo) {
        this.proyectoRepo = proyectoRepo;
    }

    public List<Proyecto> listar() {
        return proyectoRepo.findAll();
    }

    public Proyecto guardar(Proyecto proyecto) {
        return proyectoRepo.save(proyecto);
    }

    public Proyecto buscarPorId(String id) {
        return proyectoRepo.findById(id).orElseThrow();
    }

    public void eliminar(String id) {
        proyectoRepo.deleteById(id);
    }

    public List<Proyecto> buscarPorEmpleado(Long empleadoId) {
        return proyectoRepo.findByEmpleadoId(empleadoId);
    }
}
