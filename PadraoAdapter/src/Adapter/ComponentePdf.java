package Adapter;

public class ComponentePdf {
    private String conteudo;

    public void pdfFixaConteudo(String conteudo) {
        this.conteudo = conteudo;
        System.out.println("Serviço legado definindo conteúdo PDF: " + this.conteudo);
    }

    public void pdfPreparaExibicao() {
        System.out.println("Serviço legado preparando exibição PDF");
    }

    public void pdfAtualiza() {
        System.out.println("Serviço legado atualizando exibição PDF");
    }

    public void pdfFinalizaExibicao() {
        System.out.println("Serviço legado finalizando exibição PDF");
    }

    public void pdfEnviaImpressora() {
        System.out.println("Serviço legado enviando documento PDF à impressora");
    }
}
