package Adapter;

public class DocumentoPdf implements Documento{
    ComponentePdf legado = new ComponentePdf();


    public void setConteudo(String conteudo) {
        legado.pdfFixaConteudo(conteudo);
    }

    public void desenha() {
        legado.pdfPreparaExibicao();
        legado.pdfAtualizaExibicao();
        legado.pdfFinalizaExibicao();
    }

    public void imprime() {
        legado.pdfEnviaImpressora();
    }
}
