package edu.udea.InnDevComp.Repositorios;

import edu.udea.InnDevComp.modelos.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEmpleado extends JpaRepository<Empleado, Long> {
}
