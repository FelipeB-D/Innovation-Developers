package edu.udea.empresa.Empresa.servicio;

import edu.udea.empresa.Empresa.models.Empresa;
import edu.udea.empresa.Empresa.models.Perfil;
import edu.udea.empresa.Empresa.repositorio.EmpresaRepositorio;
import edu.udea.empresa.Empresa.repositorio.PerfilRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilServicio {

    @Autowired
    private PerfilRepositorio perfilRepositorio;

    public List<Perfil> getPerfil() {
        return perfilRepositorio.findAll();
    }

    public Perfil save(Perfil perfil) {return perfilRepositorio.save(perfil);}

}
