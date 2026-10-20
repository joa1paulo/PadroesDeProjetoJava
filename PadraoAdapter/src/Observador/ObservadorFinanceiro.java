package Observador;

import Singleton.Vendedor;

public class ObservadorFinanceiro implements ObservadorVenda {
    private Vendedor vendedor;

    public ObservadorFinanceiro(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void atualizar() {
        System.out.println("O FINANCEIRO VIU QUE A VENDA DE "+vendedor.getUltimoVeiculoVendido() +" FOI FEITA POR : R$ " + vendedor.getUltimoValorVendido());
    }
}
