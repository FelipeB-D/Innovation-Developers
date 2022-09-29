package edu.udea.InnDevComp.Repositorios;

import edu.udea.InnDevComp.modelos.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioTransaccion extends JpaRepository<Transaccion, Long> {
}
