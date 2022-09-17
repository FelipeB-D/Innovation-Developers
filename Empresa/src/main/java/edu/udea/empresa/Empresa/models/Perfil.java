package edu.udea.empresa.Empresa.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "perfiles")
public class Perfil {

    @Id
    private int idPerfil;
    @Column
    private String imagen;
    @Column
    private String telefono;
    @Column
    private Date fechaCreacionPerfil;
    @Column
    private Date fechaActualizacionPerfil;

    @OneToOne
    private Empleado empleado;

    public Perfil(int idPerfil, String imagen, String telefono, Date fechaCreacionPerfil, Date fechaActualizacionPerfil, Empleado empleado) {
        this.idPerfil = idPerfil;
        this.imagen = imagen;
        this.telefono = telefono;
        this.fechaCreacionPerfil = fechaCreacionPerfil;
        this.fechaActualizacionPerfil = fechaActualizacionPerfil;
        this.empleado = empleado;
    }

    public Perfil() {
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaCreacionPerfil() {
        return fechaCreacionPerfil;
    }

    public void setFechaCreacionPerfil(Date fechaCreacionPerfil) {
        this.fechaCreacionPerfil = fechaCreacionPerfil;
    }

    public Date getFechaActualizacionPerfil() {
        return fechaActualizacionPerfil;
    }

    public void setFechaActualizacionPerfil(Date fechaActualizacionPerfil) {
        this.fechaActualizacionPerfil = fechaActualizacionPerfil;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
