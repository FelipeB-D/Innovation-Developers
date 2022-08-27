package edu.udea.main.controlador;

import edu.udea.main.model.Empleado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class EmpleadoControlador {
    @GetMapping("api/Empleado")
    public List<Empleado> obtenerEmpleado(){
        List<Empleado> listaEmpleados = new ArrayList<>();
        Empleado e = new Empleado();
        e.setNombreEmpleado("Esmeralda");
        e.setEmpresaEmpleado("XXX");
        e.setRolEmpleado("Gerente");
        e.setCorreoEmpleado("gerente@gmail.com");

        Empleado e1 = new Empleado();
        e1.setNombreEmpleado("David");
        e1.setEmpresaEmpleado("XXX");
        e1.setRolEmpleado("Subgerente");
        e1.setCorreoEmpleado("subgerente@gmail.com");

        listaEmpleados.add(e);
        listaEmpleados.add(e1);

        return listaEmpleados;
    }
}
