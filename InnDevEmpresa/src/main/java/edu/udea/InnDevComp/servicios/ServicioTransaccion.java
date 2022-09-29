package edu.udea.InnDevComp.servicios;


import edu.udea.InnDevComp.Repositorios.RepositorioTransaccion;
import edu.udea.InnDevComp.modelos.Transaccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioTransaccion {

    @Autowired
    public RepositorioTransaccion repositorioTransaccion;

    public Transaccion crear(Transaccion nTransaccion) {
        return repositorioTransaccion.save(nTransaccion);
    }

    public Transaccion actualizar(Transaccion nTransaccion) {
        return repositorioTransaccion.save(nTransaccion);
    }

    public List<Transaccion> Listar() {
        return repositorioTransaccion.findAll();
    }

    public void eliminar (Transaccion nTransaccion) {
        repositorioTransaccion.delete(nTransaccion);
    }
}
