package com.company;

import com.company.models.*;

public class Main {

    public static void main(String[] args) {
        Empresa batata = new Empresa("123456/0001");
        FabricaEmpregado fabrica = FabricaEmpregado.getInstance();

        EmpregadoRelacaoDep batataJunior = (EmpregadoRelacaoDep)fabrica.criaEmpregado("EMP-INT");
        EmpregadoContratado batataJunior2 = (EmpregadoContratado)fabrica.criaEmpregado("EMP-EXT");

        batataJunior.setSalarioMensal(2000);
        batataJunior2.setValorPorHora(20);
        batataJunior2.setImposto(0.10);

        batata.addEmpregado(batataJunior);
        batata.addEmpregado(batataJunior2);

        System.out.println(batata.calculaSalarioTotal(30));
    }


}
