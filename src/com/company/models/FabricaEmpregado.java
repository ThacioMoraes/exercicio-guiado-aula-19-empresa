package com.company.models;

public class FabricaEmpregado {

    private static FabricaEmpregado instance;

    private FabricaEmpregado(){};

    public static FabricaEmpregado getInstance(){
        if (instance == null){
            instance = new FabricaEmpregado();
        }
        return instance;
    }

    public Empregado criaEmpregado(String tipoEmpregado){
        if (tipoEmpregado.equals("EMP-INT")){
            return new EmpregadoRelacaoDep();
        }
        if (tipoEmpregado.equals("EMP-EXT")){
            return new EmpregadoContratado();
        }
        return null;
    }
}
