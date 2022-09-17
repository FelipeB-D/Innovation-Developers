package edu.udea.empresa.Empresa.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transacciones")
public class Transaccion {

    @Id
    private int idTransaccion;
    @Column
    private String concepto;
    @Column
    private float cantidad;
    @Column
    private Date fechaCreacionTransaccion;
    @Column
    private Date fechaActualizacionTransaccion;
    @ManyToOne
    private Empleado empleado;
    @ManyToOne
    private Empresa empresa;

    public Transaccion(int idTransaccion, String concepto, float cantidad, Date fechaCreacionTransaccion, Date fechaActualizacionTransaccion, Empleado empleado, Empresa empresa) {
        this.idTransaccion = idTransaccion;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.fechaCreacionTransaccion = fechaCreacionTransaccion;
        this.fechaActualizacionTransaccion = fechaActualizacionTransaccion;
        this.empleado = empleado;
        this.empresa = empresa;
    }

    public Transaccion() {
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaCreacionTransaccion() {
        return fechaCreacionTransaccion;
    }

    public void setFechaCreacionTransaccion(Date fechaCreacionTransaccion) {
        this.fechaCreacionTransaccion = fechaCreacionTransaccion;
    }

    public Date getFechaActualizacionTransaccion() {
        return fechaActualizacionTransaccion;
    }

    public void setFechaActualizacionTransaccion(Date fechaActualizacionTransaccion) {
        this.fechaActualizacionTransaccion = fechaActualizacionTransaccion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
