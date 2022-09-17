package edu.udea.empresa.Empresa.repositorio;

import edu.udea.empresa.Empresa.models.Empleado;
import edu.udea.empresa.Empresa.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepositorio extends JpaRepository <Empresa, Integer> {
}
