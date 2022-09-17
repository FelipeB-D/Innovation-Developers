package edu.udea.empresa.Empresa.controlador;

import edu.udea.empresa.Empresa.models.Empresa;
import edu.udea.empresa.Empresa.models.Perfil;
import edu.udea.empresa.Empresa.servicio.EmpresaServicio;
import edu.udea.empresa.Empresa.servicio.PerfilServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PatchMapping("/perfil/{id}")
    public ResponseEntity<?> ActualizarPerfil(@PathVariable Long id,@RequestBody Perfil perfil) {

        try {
            Perfil perfil_actual = perfilServicio.getPerfil(id);
            perfil_actual.setImagen(perfil.getImagen());

            perfilServicio.save(perfil_actual);
            return new ResponseEntity<Perfil>(HttpStatus.OK);
        }catch (Exception exception) {
            return new ResponseEntity<Perfil>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/perfil/{id}")
    public void eliminar_Perfil(@PathVariable Long id) {
        perfilServicio.Eliminar_Perfil(id);
    }

}
