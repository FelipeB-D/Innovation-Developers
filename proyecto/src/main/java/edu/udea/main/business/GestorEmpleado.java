package edu.udea.main.business;

import edu.udea.main.model.Empleado;

import java.util.ArrayList;

public class GestorEmpleado {

    public ArrayList<Empleado> empleados;

    public GestorEmpleado(){

        this.empleados = new ArrayList<>();

        this.empleados.add(new Empleado("Angela", "angela@id.com", "InnovationsDevelopers", "administradora" ));
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
