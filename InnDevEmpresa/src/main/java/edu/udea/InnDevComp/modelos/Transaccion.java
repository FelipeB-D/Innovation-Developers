package edu.udea.InnDevComp.modelos;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transacciones")
public class Transaccion {

    @Id
    private Long idTransaccion;
    @Column
    private String concepto;
    @Column
    private String cantidad;
    @Column
    private String valor;
    @Column
    private Date fechaCreacionTransaccion;
    @Column
    private Date fechaActualizacionTransaccion;
    @ManyToOne
    private Empleado empleado;
    @ManyToOne
    private Empresa empresa;

    public Transaccion(Long idTransaccion, String concepto, String cantidad, String valor, Date fechaCreacionTransaccion, Date fechaActualizacionTransaccion, Empleado empleado, Empresa empresa) {
        this.idTransaccion = idTransaccion;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.valor = valor;
        this.fechaCreacionTransaccion = fechaCreacionTransaccion;
        this.fechaActualizacionTransaccion = fechaActualizacionTransaccion;
        this.empleado = empleado;
        this.empresa = empresa;
    }

    public Transaccion() {
    }

    public Long getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Long idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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
