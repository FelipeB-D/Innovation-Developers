package edu.udea.empresa.Empresa.controlador;

import edu.udea.empresa.Empresa.models.Empresa;
import edu.udea.empresa.Empresa.models.Perfil;
import edu.udea.empresa.Empresa.models.Transaccion;
import edu.udea.empresa.Empresa.servicio.PerfilServicio;
import edu.udea.empresa.Empresa.servicio.TransaccionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PatchMapping("/transaccion/{id}")
    public ResponseEntity<?> ActualizarTransaccion(@PathVariable Long id,@RequestBody Transaccion transaccion) {

        try {
            Transaccion transaccion_actual = transaccionServicio.getTransaccion(id);
            transaccion_actual.setConcepto(transaccion.getConcepto());

            transaccionServicio.save(transaccion_actual);
            return new ResponseEntity<Transaccion>(HttpStatus.OK);
        }catch (Exception exception) {
            return new ResponseEntity<Transaccion>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/transaccion/{id}")
    public void eliminar_Transaccion(@PathVariable Long id) {
        transaccionServicio.Eliminar_Transaccion(id);
    }

}
