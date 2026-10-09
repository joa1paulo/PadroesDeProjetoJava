import Singleton.*;
import Observer.*;
import Strategy.*;

void main(){
    VendedorSingleton v1 = VendedorSingleton.getInstance(); // 1

    v1.setNome("Vendedor Joao");
    v1.setEmail("joao@joaomail.com");
    v1.setEndereco("Rua Joao");         //2

    ObservadorVenda obsEstoque = new ObservadorEstoque(v1);
    ObservadorVenda obsFinanceiro = new ObservadorFinanceiro(v1);

    v1.adicionarObservador(obsEstoque);
    v1.adicionarObservador(obsFinanceiro); //3

    System.out.println("=============================================================================");

    v1.setEstrategia(new DescontoNormal());
    v1.concluirVenda("CAMARO",80000); //4

    System.out.println("=============================================================================");
    System.out.println("MUDANCA DE DESCONTO NO MESMO CARRO");
    System.out.println("=============================================================================");

    v1.setEstrategia(new DescontoPromocional());
    v1.concluirVenda("CAMARO",80000); //5 Mesmo valor só pra ver diferença do desconto

    System.out.println("=============================================================================");

    VendedorSingleton v2 = VendedorSingleton.getInstance(); // 6

    System.out.println("Mesmo vendedor?" + v2.exibir(v1));

}