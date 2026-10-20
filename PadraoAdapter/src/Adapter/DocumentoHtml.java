package Adapter;

public class DocumentoHtml implements Documento{
    String conteudo;

    @Override
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
        System.out.println("Serviço moderno salvando conteúdo html");
    }

    public void desenha() {
        System.out.println("Servico moderno preparando documento html");
    }

    public void imprime() {
        System.out.println("Servico moderno imprimindo html");
    }

}
