// src/main/java/com/miaplicacion/crudmixto/repository/EmpleadoRepository.java
package com.miaplicacion.crudmixto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miaplicacion.crudmixto.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}
