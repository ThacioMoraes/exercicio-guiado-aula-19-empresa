package com.company.models;

public class EmpregadoRelacaoDep extends Empregado{

    private double salarioMensal = 100;

    @Override
    public double calculaSalario(int dias){
        return (this.salarioMensal / 30) * dias;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
