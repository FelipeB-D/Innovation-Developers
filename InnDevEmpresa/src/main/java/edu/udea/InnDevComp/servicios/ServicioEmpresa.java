package edu.udea.InnDevComp.servicios;


import edu.udea.InnDevComp.Repositorios.RepositorioEmpresa;
import edu.udea.InnDevComp.modelos.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEmpresa {

    @Autowired
    public RepositorioEmpresa repositorioEmpresa;

    public Empresa crear(Empresa nEmpresa) {
        return repositorioEmpresa.save(nEmpresa);
    }

    public Empresa actualizar(Empresa nEmpresa) {
        return repositorioEmpresa.save(nEmpresa);
    }

    public List<Empresa> Listar() {
        return repositorioEmpresa.findAll();
    }

    public void eliminar (Empresa nEmpresa) {
        repositorioEmpresa.delete(nEmpresa);
    }
}
