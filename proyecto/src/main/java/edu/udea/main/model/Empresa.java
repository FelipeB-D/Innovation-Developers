package edu.udea.main.model;

public class Empresa {

    private String nombreEmpresa;
    private String direccionEmpresa;
    private int telefonoEmpresa;
    private int NITempresa;

    public Empresa(String nombreEmpresa, String direccionEmpresa, int telefonoEmpresa, int NITempresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.NITempresa = NITempresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public int getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(int telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public int getNITempresa() {
        return NITempresa;
    }

    public void setNITempresa(int NITempresa) {
        this.NITempresa = NITempresa;
    }
}
