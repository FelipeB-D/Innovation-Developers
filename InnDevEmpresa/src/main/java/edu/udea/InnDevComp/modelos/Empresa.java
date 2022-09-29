package edu.udea.InnDevComp.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "empresas")
public class Empresa {

    @Id
    private Long idEmpresa;
    @Column
    private String nombreEmpresa;
    @Column
    private String documentoEmpresa;
    @Column
    private String telefonoEmpresa;
    @Column
    private String direccionEmpresa;
    @Column
    private Date fechaCreacionEmpresa;
    @Column
    private Date fechaActualizacionEmpresa;
    @JsonIgnore
    @OneToMany(mappedBy = "empresa")
    private List<Empleado> empleados;
    @JsonIgnore
    @OneToMany(mappedBy = "empresa")
    private List<Transaccion> transacciones;

    public Empresa(Long idEmpresa, String nombreEmpresa, String documentoEmpresa, String telefonoEmpresa, String direccionEmpresa, Date fechaCreacionEmpresa, Date fechaActualizacionEmpresa, List<Empleado> empleados, List<Transaccion> transacciones) {
        this.idEmpresa = idEmpresa;
        this.nombreEmpresa = nombreEmpresa;
        this.documentoEmpresa = documentoEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.fechaCreacionEmpresa = fechaCreacionEmpresa;
        this.fechaActualizacionEmpresa = fechaActualizacionEmpresa;
        this.empleados = empleados;
        this.transacciones = transacciones;
    }

    public Empresa() {
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDocumentoEmpresa() {
        return documentoEmpresa;
    }

    public void setDocumentoEmpresa(String documentoEmpresa) {
        this.documentoEmpresa = documentoEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public Date getFechaCreacionEmpresa() {
        return fechaCreacionEmpresa;
    }

    public void setFechaCreacionEmpresa(Date fechaCreacionEmpresa) {
        this.fechaCreacionEmpresa = fechaCreacionEmpresa;
    }

    public Date getFechaActualizacionEmpresa() {
        return fechaActualizacionEmpresa;
    }

    public void setFechaActualizacionEmpresa(Date fechaActualizacionEmpresa) {
        this.fechaActualizacionEmpresa = fechaActualizacionEmpresa;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(List<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
}
