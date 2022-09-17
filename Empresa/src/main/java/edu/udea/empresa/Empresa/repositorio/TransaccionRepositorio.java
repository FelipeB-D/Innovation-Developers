package edu.udea.empresa.Empresa.repositorio;

import edu.udea.empresa.Empresa.models.Perfil;
import edu.udea.empresa.Empresa.models.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionRepositorio extends JpaRepository <Transaccion, Integer> {
}
