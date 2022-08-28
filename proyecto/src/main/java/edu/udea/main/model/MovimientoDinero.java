package edu.udea.main.model;

public class MovimientoDinero {

    private String movimiento;
    private int montoMovimiento;
    private int conceptoDelMovimiento;
    private String usEncRegistro;

    public MovimientoDinero(String movimiento, int montoMovimiento, int conceptoDelMovimiento, String usEncRegistro) {
        this.movimiento = movimiento;
        this.montoMovimiento = montoMovimiento;
        this.conceptoDelMovimiento = conceptoDelMovimiento;
        this.usEncRegistro = usEncRegistro;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public int getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(int montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public int getConceptoDelMovimiento() {
        return conceptoDelMovimiento;
    }

    public void setConceptoDelMovimiento(int conceptoDelMovimiento) {
        this.conceptoDelMovimiento = conceptoDelMovimiento;
    }

    public String getUsEncRegistro() {
        return usEncRegistro;
    }

    public void setUsEncRegistro(String usEncRegistro) {
        this.usEncRegistro = usEncRegistro;
    }
}
