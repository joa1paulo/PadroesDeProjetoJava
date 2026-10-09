package Observer;

import Singleton.VendedorSingleton;

public class ObservadorEstoque implements ObservadorVenda{
    private VendedorSingleton vendedor;

    public ObservadorEstoque(VendedorSingleton vendedor) {
        this.vendedor = vendedor;
    }

    public void atualizar(){
        System.out.println("O ESTOQUE ficou sabendo que: ULTIMA VENDA: " + vendedor.getUltimoVeiculoVendido() + " | PRECO: R$" + vendedor.getUltimoPrecoFinal());
    }
}
