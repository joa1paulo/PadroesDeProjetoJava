package Template;

import Adapter.Documento;
import Singleton.Vendedor;

public class VendaPresencial extends ProcessamentoVenda {
    public VendaPresencial(Vendedor vendedor, Documento documento) {
        super(vendedor, documento);
    }

    @Override
    protected void prepararVenda() {
        System.out.println("Preparando venda presencial...");
    }
}
