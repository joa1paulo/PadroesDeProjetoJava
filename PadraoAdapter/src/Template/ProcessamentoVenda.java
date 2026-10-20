package Template;

import Adapter.Documento;
import Singleton.Vendedor;

public abstract class ProcessamentoVenda {
    private Vendedor vendedor;
    private Documento documento;
    protected boolean isVendaPresencial;

    public ProcessamentoVenda(Vendedor vendedor, Documento documento) {
        this.vendedor = vendedor;
        this.documento = documento;
    }

    public final void executarVenda(String veiculo,double preco){
        double precoFinal = calcularValorFinal(preco); //calculado unica vez
        vendedor.ConcluirVenda(veiculo,precoFinal);
        documento.setConteudo("Veículo : "+veiculo + "vendido pelo preco de: " + precoFinal);
        documento.desenha();
        documento.imprime();
        if(isVendaPresencial){
            prepararVenda();
        }
    }

    private double calcularValorFinal(double preco) {
        return vendedor.CalcularPrecoVendedor(preco);
    }

    private void prepararVenda() {
        System.out.println("Preparando Venda...");
    }


}
