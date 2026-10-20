package Observador;

import Singleton.Vendedor;

public class Estoque implements ObservadorVenda {
    private Vendedor vendedor;

    public Estoque(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public void atualizar() {
        System.out.println("O ESTOQUE VIU QUE A VENDA DE " + vendedor.getUltimoVeiculoVendido()
                + " FOI FEITA POR: R$ " + vendedor.getUltimoPrecoFinal());
    }
}
