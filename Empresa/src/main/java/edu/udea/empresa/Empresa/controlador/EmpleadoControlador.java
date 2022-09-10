package edu.udea.empresa.Empresa.controlador;

import edu.udea.empresa.Empresa.models.Empleado;
import edu.udea.empresa.Empresa.servicio.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpleadoControlador {

    @Autowired
    private EmpleadoServicio empleadoServicio;

    @GetMapping("/empleados")
    public ResponseEntity<List<Empleado>>getEmpleados() {
        return new ResponseEntity<>(empleadoServicio.getEmpleado(), HttpStatus.OK);

    }

    @PostMapping("/empleado")
    public ResponseEntity<Empleado> setEmpleado(@RequestBody Empleado empleado) {
        return new ResponseEntity<>(empleadoServicio.save(empleado),HttpStatus.OK);

    }

}
