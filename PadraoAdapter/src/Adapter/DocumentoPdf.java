package Adapter;

public class DocumentoPdf implements Documento {
    private ComponentePdf ferramentaPdf;

    public DocumentoPdf(ComponentePdf ferramentaPdf) {
        this.ferramentaPdf = ferramentaPdf;
    }

    @Override
    public void setConteudo(String conteudo) {
        ferramentaPdf.pdfFixaConteudo(conteudo);
    }

    @Override
    public void desenha() {
        ferramentaPdf.pdfPreparaExibicao();
        ferramentaPdf.pdfAtualiza();
        ferramentaPdf.pdfFinalizaExibicao();
    }

    @Override
    public void imprime() {
        ferramentaPdf.pdfEnviaImpressora();
    }
}
