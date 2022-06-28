package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cnpj;
    private List<Empregado> empregados = new ArrayList<Empregado>();

    public Empresa(String cnpj){
        this.cnpj = cnpj;
    }

    public void addEmpregado(Empregado empregado){
        empregados.add(empregado);
    }

    public double calculaSalarioTotal(int dias){
        double total = 0;

        for (Empregado empregado: empregados){
            total += empregado.calculaSalario(dias);
        }

        return total;
    }
}
