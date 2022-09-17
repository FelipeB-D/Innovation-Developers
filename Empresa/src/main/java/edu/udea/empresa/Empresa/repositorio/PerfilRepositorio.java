package edu.udea.empresa.Empresa.repositorio;

import edu.udea.empresa.Empresa.models.Empresa;
import edu.udea.empresa.Empresa.models.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepositorio extends JpaRepository <Perfil, Integer> {
}
