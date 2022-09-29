package edu.udea.InnDevComp.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    private Long idEmpleado;
    @Column
    private Long documentoEmpleado;
    @Column
    private String nombreEmpleado;
    @Column
    private String direccionEmpleado;
    @Column
    private String telefonoEmpleado;
    @Column
    private String email;
    @Column
    private Date fechaCreacionEmpleado;
    @Column
    private Date fechaActualizacionEmpleado;
    @Column
    private String rol;
    @ManyToOne
    private Empresa empresa;
    @JsonIgnore
    @OneToMany(mappedBy = "empleado")
    private List<Transaccion> transacciones;

    public Empleado(Long idEmpleado, Long documentoEmpleado, String nombreEmpleado, String direccionEmpleado, String telefonoEmpleado, String email, Date fechaCreacionEmpleado, Date fechaActualizacionEmpleado, String rol, Empresa empresa, List<Transaccion> transacciones) {
        this.idEmpleado = idEmpleado;
        this.documentoEmpleado = documentoEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
        this.email = email;
        this.fechaCreacionEmpleado = fechaCreacionEmpleado;
        this.fechaActualizacionEmpleado = fechaActualizacionEmpleado;
        this.rol = rol;
        this.empresa = empresa;
        this.transacciones = transacciones;
    }

    public Empleado() {
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Long getDocumentoEmpleado() {
        return documentoEmpleado;
    }

    public void setDocumentoEmpleado(Long documentoEmpleado) {
        this.documentoEmpleado = documentoEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
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
