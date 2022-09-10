package edu.udea.empresa.Empresa.controlador;

import edu.udea.empresa.Empresa.models.Empresa;
import edu.udea.empresa.Empresa.models.Perfil;
import edu.udea.empresa.Empresa.servicio.EmpresaServicio;
import edu.udea.empresa.Empresa.servicio.PerfilServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PerfilControlador {

    @Autowired
    private PerfilServicio perfilServicio;

    @GetMapping("/perfiles")
    public ResponseEntity<List<Perfil>>getPerfiles() {
        return new ResponseEntity<>(perfilServicio.getPerfil(), HttpStatus.OK);

    }

    @PostMapping("/perfil")
    public ResponseEntity<Perfil> setPerfil(@RequestBody Perfil perfil) {
        return new ResponseEntity<>(perfilServicio.save(perfil),HttpStatus.OK);

    }

}
