package edu.udea.InnDevComp.controladores;


import edu.udea.InnDevComp.modelos.Empresa;
import edu.udea.InnDevComp.servicios.ServicioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class ControladorEmpresa {

    @Autowired
    private ServicioEmpresa servicioEmpresa;

    @GetMapping
    public List<Empresa> Listar(){
        return servicioEmpresa.Listar();
    }

    @PostMapping
    public Empresa crear(@RequestBody Empresa nEmpresa) {
        return servicioEmpresa.crear(nEmpresa);
    }

    @PutMapping
    public Empresa actualizar(@RequestBody Empresa nEmpresa) {
        return servicioEmpresa.actualizar(nEmpresa);
    }

    @DeleteMapping
    public void eliminar (@RequestBody Empresa nEmpresa) {
        servicioEmpresa.eliminar(nEmpresa);
    }
}
