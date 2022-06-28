package com.company;

import com.company.models.Empregado;
import com.company.models.Empresa;
import com.company.models.FabricaEmpregado;

public class Main {

    public static void main(String[] args) {
        Empresa batata = new Empresa("123456/0001");
        FabricaEmpregado fabrica = FabricaEmpregado.getInstance();

        Empregado batataJunior = fabrica.criaEmpregado("EMP-INT");
        Empregado batataJunior2 = fabrica.criaEmpregado("EMP-INT");
        
        batata.addEmpregado(batataJunior);
        batata.addEmpregado(batataJunior2);

        System.out.println(batata.calculaSalarioTotal(30));
    }


}
