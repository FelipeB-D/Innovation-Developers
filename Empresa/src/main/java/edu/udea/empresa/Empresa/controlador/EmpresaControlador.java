package edu.udea.empresa.Empresa.controlador;

import edu.udea.empresa.Empresa.models.Empleado;
import edu.udea.empresa.Empresa.models.Empresa;
import edu.udea.empresa.Empresa.servicio.EmpleadoServicio;
import edu.udea.empresa.Empresa.servicio.EmpresaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpresaControlador {

    @Autowired
    private EmpresaServicio empresaServicio;

    @GetMapping("/empresas")
    public ResponseEntity<List<Empresa>>getEmpresas() {
        return new ResponseEntity<>(empresaServicio.getEmpresa(), HttpStatus.OK);

    }

    @PostMapping("/empresa")
    public ResponseEntity<Empresa> setEmpresa(@RequestBody Empresa empresa) {
        return new ResponseEntity<>(empresaServicio.save(empresa),HttpStatus.OK);

    }

}
