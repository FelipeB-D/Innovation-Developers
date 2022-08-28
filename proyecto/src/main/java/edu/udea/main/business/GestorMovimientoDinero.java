package edu.udea.main.business;

import edu.udea.main.model.MovimientoDinero;

import java.util.ArrayList;

public class GestorMovimientoDinero {
    private ArrayList<MovimientoDinero> movimientosdinero;

    public GestorMovimientoDinero(){
        this.movimientosdinero = new ArrayList<>();
        this.movimientosdinero.add(new MovimientoDinero("Ingreso", "5000","pago trabajo","Angela"));
        this.movimientosdinero.add(new MovimientoDinero("Ingreso","3000","donacón","Luis"));
        this.movimientosdinero.add(new MovimientoDinero("Egreso","4000","pago internet","Jorge"));
        this.movimientosdinero.add(new MovimientoDinero("Ingreso","8000","pago cliente","Oscar"));
        this.movimientosdinero.add(new MovimientoDinero("Egreso", "7000","pago servicios públicos","Felipe"));
    }

    public ArrayList<MovimientoDinero> getMovimientosdinero() {
        return movimientosdinero;
    }

    public void setMovimientosdinero(ArrayList<MovimientoDinero> movimientosdinero) {
        this.movimientosdinero = movimientosdinero;
    }
}
