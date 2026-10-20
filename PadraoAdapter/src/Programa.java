import Adapter.ComponentePdf;
import Adapter.Documento;
import Adapter.DocumentoHtml;
import Adapter.DocumentoPdf;
import Estrategias.DescontoNormal;
import Estrategias.DescontoPromocional;
import Observador.Estoque;
import Observador.Financeiro;
import Observador.ObservadorVenda;
import Singleton.Vendedor;
import Template.ProcessamentoVenda;
import Template.VendaOnline;
import Template.VendaPresencial;

public class Programa {
    public static void main(String[] args) {
        Vendedor vendedor = Vendedor.getInstance();

        ObservadorVenda estoque = new Estoque(vendedor);
        ObservadorVenda financeiro = new Financeiro(vendedor);
        vendedor.adicionarObservador(estoque);
        vendedor.adicionarObservador(financeiro);

        vendedor.setEstrategia(new DescontoNormal());
        ProcessamentoVenda vendaPresencial = new VendaPresencial(vendedor, new DocumentoHtml());
        vendaPresencial.executarVenda("Veículo A", 100000);

        System.out.println("\n======================================================================\n");

        vendedor.setEstrategia(new DescontoPromocional());
        ComponentePdf legado = new ComponentePdf();
        Documento documentoPdf = new DocumentoPdf(legado);
        ProcessamentoVenda vendaOnline = new VendaOnline(vendedor, documentoPdf);
        vendaOnline.executarVenda("Veículo B", 100000);

        System.out.println("\n======================================================================\n");

        Vendedor vendedor2 = Vendedor.getInstance();
        System.out.println("Mesma instância de Vendedor: " + (vendedor == vendedor2));

        System.out.println("\n======================================================================\n");

        vendedor.setEstrategia(new DescontoPromocional());
        vendedor.removerObservador(financeiro);
        ProcessamentoVenda terceiraVenda = new VendaPresencial(vendedor, new DocumentoHtml());
        terceiraVenda.executarVenda("Veículo C", 100000);
    }
}
