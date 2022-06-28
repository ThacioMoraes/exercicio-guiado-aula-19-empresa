package com.company.models;

public class EmpregadoContratado extends Empregado{

    private double valorPorHora;
    private double imposto;

    @Override
    public double calculaSalario(int dias){
        return (valorPorHora * 8) * dias * (1 - imposto);
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
