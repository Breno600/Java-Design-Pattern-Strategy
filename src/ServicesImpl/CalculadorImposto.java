package ServicesImpl;

import Client.Orcamento;

public class CalculadorImposto {

    public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer){

        double icms = impostoQualquer.calcula(orcamento);
        System.out.println(icms);

    }

}
