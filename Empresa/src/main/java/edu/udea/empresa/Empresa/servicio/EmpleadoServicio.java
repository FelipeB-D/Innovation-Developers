package edu.udea.empresa.Empresa.servicio;

import edu.udea.empresa.Empresa.models.Empleado;
import edu.udea.empresa.Empresa.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServicio {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    public List<Empleado> getEmpleado() {
        return empleadoRepositorio.findAll();
    }

    public Empleado save(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
}


}
