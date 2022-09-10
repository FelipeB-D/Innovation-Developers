package edu.udea.empresa.Empresa.repositorio;

import edu.udea.empresa.Empresa.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository <Empleado, String> {
}
