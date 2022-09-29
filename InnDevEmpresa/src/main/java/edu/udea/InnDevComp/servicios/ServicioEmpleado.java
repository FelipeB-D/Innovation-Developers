package edu.udea.InnDevComp.servicios;


import edu.udea.InnDevComp.Repositorios.RepositorioEmpleado;
import edu.udea.InnDevComp.modelos.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEmpleado {

    @Autowired
    public RepositorioEmpleado repositorioEmpleado;

    public Empleado crear(Empleado nEmpleado) {
        return repositorioEmpleado.save(nEmpleado);
    }

    public Empleado actualizar(Empleado nEmpleado) {
        return repositorioEmpleado.save(nEmpleado);
    }

    public List<Empleado> Listar() {
        return repositorioEmpleado.findAll();
    }

    public void eliminar (Empleado nEmpleado) {
        repositorioEmpleado.delete(nEmpleado);
    }
}
