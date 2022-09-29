package edu.udea.InnDevComp.controladores;


import edu.udea.InnDevComp.modelos.Transaccion;
import edu.udea.InnDevComp.servicios.ServicioTransaccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transacciones")
public class ControladorTransaccion {

    @Autowired
    private ServicioTransaccion servicioTransaccion;

    @GetMapping
    public List<Transaccion> Listar(){
        return servicioTransaccion.Listar();
    }

    @PostMapping
    public Transaccion crear(@RequestBody Transaccion nTransaccion) {
        return servicioTransaccion.crear(nTransaccion);
    }

    @PutMapping
    public Transaccion actualizar(@RequestBody Transaccion nTransaccion) {
        return servicioTransaccion.actualizar(nTransaccion);
    }

    @DeleteMapping
    public void eliminar (@RequestBody Transaccion nTransaccion) {
        servicioTransaccion.eliminar(nTransaccion);
    }
}
