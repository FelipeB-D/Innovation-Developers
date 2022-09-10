package edu.udea.empresa.Empresa.servicio;

import edu.udea.empresa.Empresa.models.Empleado;
import edu.udea.empresa.Empresa.models.Empresa;
import edu.udea.empresa.Empresa.repositorio.EmpleadoRepositorio;
import edu.udea.empresa.Empresa.repositorio.EmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServicio {

    @Autowired
    private EmpresaRepositorio empresaRepositorio;

    public List<Empresa> getEmpresa() {
        return empresaRepositorio.findAll();
    }

    public Empresa save(Empresa empresa) {return empresaRepositorio.save(empresa);}

}
