package Observador;

import Singleton.Vendedor;

public class Financeiro implements ObservadorVenda {
    private Vendedor vendedor;

    public Financeiro(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public void atualizar() {
        System.out.println("O FINANCEIRO VIU QUE A VENDA DE " + vendedor.getUltimoVeiculoVendido()
                + " FOI FEITA POR: R$ " + vendedor.getUltimoPrecoFinal());
    }
}
