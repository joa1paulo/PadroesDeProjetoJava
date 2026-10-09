package Observer;

import Singleton.VendedorSingleton;

public class ObservadorFinanceiro implements ObservadorVenda{
    private VendedorSingleton vendedor;

    public ObservadorFinanceiro(VendedorSingleton vendedor) {
        this.vendedor = vendedor;
    }


    public void atualizar(){
        System.out.println("O Financeiro ficou sabendo que: ULTIMA VENDA: " + vendedor.getUltimoVeiculoVendido() + " | PRECO: R$" + vendedor.getUltimoPrecoFinal());
    }



}
