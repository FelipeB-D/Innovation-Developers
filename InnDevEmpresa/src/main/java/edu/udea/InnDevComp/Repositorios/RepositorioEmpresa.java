package edu.udea.InnDevComp.Repositorios;

import edu.udea.InnDevComp.modelos.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioEmpresa extends JpaRepository<Empresa, Long> {
}
