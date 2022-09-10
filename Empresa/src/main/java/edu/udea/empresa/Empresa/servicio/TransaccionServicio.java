package edu.udea.empresa.Empresa.servicio;

import edu.udea.empresa.Empresa.models.Perfil;
import edu.udea.empresa.Empresa.models.Transaccion;
import edu.udea.empresa.Empresa.repositorio.PerfilRepositorio;
import edu.udea.empresa.Empresa.repositorio.TransaccionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionServicio {

    @Autowired
    private TransaccionRepositorio transaccionRepositorio;

    public List<Transaccion> getTransaccion() {
        return transaccionRepositorio.findAll();
    }

    public Transaccion save(Transaccion transaccion) {return transaccionRepositorio.save(transaccion);}

}
