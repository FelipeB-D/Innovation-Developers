package edu.udea.main.business;

import edu.udea.main.model.Empleado;

import java.util.ArrayList;

public class GestorEmpleado {

    private ArrayList<Empleado> empleados;

    public GestorEmpleado(){
        this.empleados = new ArrayList<>();
        this.empleados.add(new Empleado("Angela", "kimypunchos@gmail.com","Innovation Developers","Srum Master"));
        this.empleados.add(new Empleado("Luis", "luisalbertovalencia1966@gmail.com", "Innovation Developers","Administrador de BD"));
        this.empleados.add(new Empleado("Oscar", "oscar.rvalencia@hotmail.com","Innovation Developers"," Product Owner"));
        this.empleados.add(new Empleado("Felipe","felpebe660@hotmail.com","Innovation Developers","Analista"));
        this.empleados.add(new Empleado("Jorge","kinnorvisual123@gmail.com","Innovation Developers","Desarrollador"));
    }
    public Empleado getEmpleado(String nombreEmpleado){
        for (Empleado empleados:this.empleados){
            if (Empleado.getNombreEmpleado().equals(nombreEmpleado)){
                return Empleado;
            }
        }


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
