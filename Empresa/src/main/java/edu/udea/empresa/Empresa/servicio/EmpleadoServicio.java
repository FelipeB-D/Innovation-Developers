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

    public List<Empleado> getEmpleados() {
        return empleadoRepositorio.findAll();
    }

    public Empleado save(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
}

    public Empleado getEmpleado(Long id) {
        return empleadoRepositorio.findById(String.valueOf(Math.toIntExact(id))).get(); }

    public void Eliminar_Empleado(Long id) {
        empleadoRepositorio.deleteById(String.valueOf(Math.toIntExact(id)));
    }


}
