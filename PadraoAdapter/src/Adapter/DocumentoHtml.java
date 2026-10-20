package Adapter;

public class DocumentoHtml implements Documento {
    private String conteudo;

    @Override
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
        System.out.println("Serviço moderno salvando conteúdo HTML: " + this.conteudo);
    }

    @Override
    public void desenha() {
        System.out.println("Serviço moderno preparando documento HTML");
    }

    @Override
    public void imprime() {
        System.out.println("Serviço moderno imprimindo HTML");
    }
}
