package edu.udea.empresa.Empresa.controlador;

import edu.udea.empresa.Empresa.models.Empleado;
import edu.udea.empresa.Empresa.models.Empresa;
import edu.udea.empresa.Empresa.servicio.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoControlador {

    @Autowired
    private EmpleadoServicio empleadoServicio;

    @GetMapping("/empleados")
    public ResponseEntity<List<Empleado>>getEmpleados() {
        return new ResponseEntity<>(empleadoServicio.getEmpleados(), HttpStatus.OK);

    }

    @PostMapping("/empleado")
    public ResponseEntity<Empleado> setEmpleado(@RequestBody Empleado empleado) {
        return new ResponseEntity<>(empleadoServicio.save(empleado),HttpStatus.OK);

    }

    @PatchMapping("/empleado/{id}")
    public ResponseEntity<?> ActualizarEmpleado(@PathVariable Long id,@RequestBody Empleado empleado) {

        try {
            Empleado empleado_actual = empleadoServicio.getEmpleado(id);
            empleado_actual.setEmail(empleado.getEmail());

            empleadoServicio.save(empleado_actual);
            return new ResponseEntity<Empleado>(HttpStatus.OK);
        }catch (Exception exception) {
            return new ResponseEntity<Empleado>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/empleado/{id}")
    public void eliminar_Empleado(@PathVariable Long id) {
        empleadoServicio.Eliminar_Empleado(id);
    }

}
