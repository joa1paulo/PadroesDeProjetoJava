package Template;

import Adapter.Documento;
import Singleton.Vendedor;

public class ProcessamentoPresencial extends ProcessamentoVenda{

    public ProcessamentoPresencial(Vendedor vendedor, Documento documento) {
        super(vendedor, documento);
        super.isVendaPresencial = true;
    }
}
