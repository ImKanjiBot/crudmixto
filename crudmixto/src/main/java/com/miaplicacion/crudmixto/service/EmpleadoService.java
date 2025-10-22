// src/main/java/com/miaplicacion/crudmixto/service/EmpleadoService.java
package com.miaplicacion.crudmixto.service;

import com.miaplicacion.crudmixto.model.Empleado;
import com.miaplicacion.crudmixto.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepo;

    public EmpleadoService(EmpleadoRepository empleadoRepo) {
        this.empleadoRepo = empleadoRepo;
    }

    public List<Empleado> listar() {
        return empleadoRepo.findAll();
    }

    public Empleado guardar(Empleado empleado) {
        return empleadoRepo.save(empleado);
    }

    public Empleado buscarPorId(Long id) {
        return empleadoRepo.findById(id).orElseThrow();
    }

    public void eliminar(Long id) {
        empleadoRepo.deleteById(id);
    }
}
