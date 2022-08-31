
package edu.udea.main.controlador;

public class EmpleadoControlador {
}


package edu.udea.main.controlador;


import edu.udea.main.business.GestorEmpleado;
import edu.udea.main.model.Empleado;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public  class EmpleadoControlador {

    private GestorEmpleado gestorEmpleado = new GestorEmpleado();

    @GetMapping("/empleado")
    public ResponseEntity<ArrayList<Empleado>> getEmpleados(){
        return new ResponseEntity<>(gestorEmpleado.getEmpleados(), HttpStatus.ACCEPTED);
    }

}

package edu.udea.main.controlador;

public class EmpleadoControlador {
}

