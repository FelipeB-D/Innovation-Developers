package edu.udea.empresa.Empresa.controlador;

import edu.udea.empresa.Empresa.models.Perfil;
import edu.udea.empresa.Empresa.models.Transaccion;
import edu.udea.empresa.Empresa.servicio.PerfilServicio;
import edu.udea.empresa.Empresa.servicio.TransaccionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransaccionControlador {

    @Autowired
    private TransaccionServicio transaccionServicio;

    @GetMapping("/transacciones")
    public ResponseEntity<List<Transaccion>>getTransacciones() {
        return new ResponseEntity<>(transaccionServicio.getTransaccion(), HttpStatus.OK);

    }

    @PostMapping("/transaccion")
    public ResponseEntity<Transaccion> setTransaccion(@RequestBody Transaccion transaccion) {
        return new ResponseEntity<>(transaccionServicio.save(transaccion),HttpStatus.OK);

    }

}
