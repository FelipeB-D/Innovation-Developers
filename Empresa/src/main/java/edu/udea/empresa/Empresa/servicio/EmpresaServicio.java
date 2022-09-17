package edu.udea.empresa.Empresa.servicio;

import edu.udea.empresa.Empresa.models.Empresa;
import edu.udea.empresa.Empresa.repositorio.EmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpresaServicio {

    @Autowired
    private EmpresaRepositorio empresaRepositorio;

    public List<Empresa> getEmpresas() {
        return empresaRepositorio.findAll();
    }

    public Empresa save(Empresa empresa) {return empresaRepositorio.save(empresa);}

    public Empresa getEmpresa(Long id) {
        return empresaRepositorio.findById(Math.toIntExact(id)).get();
    }

    public void Eliminar_Empresa(Long id) {
        empresaRepositorio.deleteById(Math.toIntExact(id));
    }

}
