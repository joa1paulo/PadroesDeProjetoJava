package Template;

import Adapter.Documento;
import Singleton.Vendedor;

public class ProcessamentoOnline extends ProcessamentoVenda{
    public ProcessamentoOnline(Vendedor vendedor, Documento documento) {
        super(vendedor, documento);
        super.isVendaPresencial = false;
    }

}
