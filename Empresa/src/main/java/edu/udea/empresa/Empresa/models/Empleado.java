package edu.udea.empresa.Empresa.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    private String idEmpleado;
    @Column
    private String email;
    @Column
    private Date fechaCreacionEmpleado;
    @Column
    private Date fechaActualizacionEmpleado;
    @Column
    private Rol rol;
    @OneToOne(mappedBy = "empleado")
    private Perfil perfil;
    @ManyToOne
    private Empresa empresa;
    @OneToMany(mappedBy = "empleado")
    private List<Transaccion> transacciones;


    public Empleado(String idEmpleado, String email, Date fechaCreacionEmpleado, Date fechaActualizacionEmpleado, Rol rol, Perfil perfil, Empresa empresa, List<Transaccion> transacciones) {
        this.idEmpleado = idEmpleado;
        this.email = email;
        this.fechaCreacionEmpleado = fechaCreacionEmpleado;
        this.fechaActualizacionEmpleado = fechaActualizacionEmpleado;
        this.perfil = perfil;
        this.rol = rol;
        this.empresa = empresa;
        this.transacciones = transacciones;
    }

    public Empleado() {
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaCreacionEmpleado() {
        return fechaCreacionEmpleado;
    }

    public void setFechaCreacionEmpleado(Date fechaCreacionEmpleado) {
        this.fechaCreacionEmpleado = fechaCreacionEmpleado;
    }

    public Date getFechaActualizacionEmpleado() {
        return fechaActualizacionEmpleado;
    }

    public void setFechaActualizacionEmpleado(Date fechaActualizacionEmpleado) {
        this.fechaActualizacionEmpleado = fechaActualizacionEmpleado;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
}
