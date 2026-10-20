import Adapter.Documento;
import Adapter.DocumentoHtml;
import Adapter.DocumentoPdf;
import Estrategias.DescontoNormal;
import Estrategias.DescontoPromocional;
import Observador.ObservadorEstoque;
import Observador.ObservadorFinanceiro;
import Observador.ObservadorVenda;
import Singleton.Vendedor;
import Template.ProcessamentoOnline;
import Template.ProcessamentoPresencial;
import Template.ProcessamentoVenda;

void main(String[] args) {
    ProcessamentoVenda processamentoVenda;
    Vendedor vendedor = Vendedor.getInstance();
    ObservadorVenda o1 = new ObservadorEstoque(vendedor);
    vendedor.adicionarObservador(o1);
    ObservadorVenda o2 = new ObservadorFinanceiro(vendedor);
    vendedor.adicionarObservador(o2);
    vendedor.setEstrategia(new DescontoNormal());

    processamentoVenda = new ProcessamentoPresencial(vendedor,new DocumentoHtml());
    processamentoVenda.executarVenda("Veiculo A", 100000);

    System.out.println("\n======================================================================\n");

    vendedor.setEstrategia(new DescontoPromocional());
    processamentoVenda = new ProcessamentoOnline(vendedor,new DocumentoPdf());
    processamentoVenda.executarVenda("Veiculo B", 100000);

    System.out.println("\n======================================================================\n");

    Vendedor vendedor2 = Vendedor.getInstance();
    if(vendedor2 == vendedor){
        System.out.println("Vendedor na mesma instância");
    }
}