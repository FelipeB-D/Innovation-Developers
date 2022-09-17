package edu.udea.empresa.Empresa.controlador;

import edu.udea.empresa.Empresa.models.Empleado;
import edu.udea.empresa.Empresa.models.Empresa;
import edu.udea.empresa.Empresa.servicio.EmpleadoServicio;
import edu.udea.empresa.Empresa.servicio.EmpresaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaControlador {

    @Autowired
    private EmpresaServicio empresaServicio;

    @GetMapping("/empresas")
    public ResponseEntity<List<Empresa>>getEmpresas() {
        return new ResponseEntity<>(empresaServicio.getEmpresas(), HttpStatus.OK);

    }

    @PostMapping("/empresa")
    public ResponseEntity<Empresa> setEmpresa(@RequestBody Empresa empresa) {
        return new ResponseEntity<>(empresaServicio.save(empresa),HttpStatus.OK);

    }

    @PatchMapping("/empresa/{id}")
    public ResponseEntity<?> ActualizarEmpresa(@PathVariable Long id,@RequestBody Empresa empresa) {

        try {
            Empresa empresa_actual = empresaServicio.getEmpresa(id);
            empresa_actual.setNombreEmpresa(empresa.getNombreEmpresa());

            empresaServicio.save(empresa_actual);
            return new ResponseEntity<Empresa>(HttpStatus.OK);
        }catch (Exception exception) {
            return new ResponseEntity<Empresa>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/empresa/{id}")
    public void eliminar_Empresa(@PathVariable Long id) {
        empresaServicio.Eliminar_Empresa(id);
    }

}
