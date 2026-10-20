package Template;

import Adapter.Documento;
import Singleton.Vendedor;

public abstract class ProcessamentoVenda {
    private final Vendedor vendedor;
    private final Documento documento;

    public ProcessamentoVenda(Vendedor vendedor, Documento documento) {
        this.vendedor = vendedor;
        this.documento = documento;
    }

    public final void executarVenda(String veiculo, double preco) {
        prepararVenda();
        double precoFinal = vendedor.calcularPrecoFinal(preco);
        vendedor.concluirVenda(veiculo, precoFinal);
        documento.setConteudo("Veículo: " + veiculo + " vendido pelo preço de: " + precoFinal);
        documento.desenha();
        documento.imprime();
    }

    protected abstract void prepararVenda();
}
