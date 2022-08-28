package edu.udea.main.business;

import edu.udea.main.model.Empresa;

import java.util.ArrayList;

public class GestorEmpresa {
    private ArrayList<Empresa> empresas;

    public GestorEmpresa(){
        this.empresas = new ArrayList<>();
        this.empresas.add(new Empresa("Innovation Developers", "Udea","1234","987"))
    }

    public Empresa getEmpresa(String nombreEmpresa){
        for (Empresa empresa:this.empresas){
            if (Empresa.getNombreEmpresa().equals(nombreEmpresa)){
                return Empresa;
            }
        }
    }

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }
}


