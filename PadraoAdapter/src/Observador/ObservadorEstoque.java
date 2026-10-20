package Observador;

import Singleton.Vendedor;

public class ObservadorEstoque implements ObservadorVenda {
    private Vendedor vendedor;

    public ObservadorEstoque(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void atualizar() {
        System.out.println("O ESTOQUE VIU QUE A VENDA DE "+vendedor.getUltimoVeiculoVendido() +" FOI FEITA POR : R$ " + vendedor.getUltimoValorVendido());
    }
}

