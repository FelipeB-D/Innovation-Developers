package edu.udea.InnDevComp.controladores;

import edu.udea.InnDevComp.modelos.Empleado;
import edu.udea.InnDevComp.servicios.ServicioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class ControladorEmpleado {

    @Autowired
    private ServicioEmpleado servicioEmpleado;

    @GetMapping
    public List<Empleado> Listar(){
        return servicioEmpleado.Listar();
    }

    @PostMapping
    public Empleado crear(@RequestBody Empleado nEmpleado) {
        return servicioEmpleado.crear(nEmpleado);
    }

    @PutMapping
    public Empleado actualizar(@RequestBody Empleado nEmpleado) {
        return servicioEmpleado.actualizar(nEmpleado);
    }

    @DeleteMapping
    public void eliminar (@RequestBody Empleado nEmpleado) {
        servicioEmpleado.eliminar(nEmpleado);
    }

}
