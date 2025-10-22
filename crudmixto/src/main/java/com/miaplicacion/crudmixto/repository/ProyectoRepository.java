// src/main/java/com/miaplicacion/crudmixto/repository/ProyectoRepository.java
package com.miaplicacion.crudmixto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.miaplicacion.crudmixto.model.Proyecto;

import java.util.List;

public interface ProyectoRepository extends MongoRepository<Proyecto, String> {
    List<Proyecto> findByEmpleadoId(Long empleadoId);
}
