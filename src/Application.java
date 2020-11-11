import Client.Orcamento;
import ServicesImpl.CalculadorImposto;
import ServicesImpl.ICMS;
import ServicesImpl.ISS;
import ServicesImpl.Imposto;

public class Application {

    public static void main(String[] args) {

        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(500.0);

        CalculadorImposto calculador = new CalculadorImposto();

        calculador.realizaCalculo(orcamento, iss);
        calculador.realizaCalculo(orcamento, icms);

    }

}
