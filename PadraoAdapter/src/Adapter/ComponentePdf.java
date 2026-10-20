package Adapter;

public class ComponentePdf {
    String conteudo;

    public void pdfFixaConteudo(String conteudo) {
        this.conteudo = conteudo;
        System.out.println("Servico legado definindo conteúdo PDF");
    }

    void pdfPreparaExibicao(){
        System.out.println("Servico legado preparando exibicao PDF");
    }

    void pdfAtualizaExibicao(){
        System.out.println("Servico legado atualizando exibicao PDF");
    }

    void pdfFinalizaExibicao(){
        System.out.println("Servico legado finalizando exibicao PDF");
    }

    void pdfEnviaImpressora(){
        System.out.println("Servico legado enviando documento PDF a impressora");
    }
}
