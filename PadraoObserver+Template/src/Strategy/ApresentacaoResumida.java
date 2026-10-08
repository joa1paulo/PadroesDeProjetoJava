package Strategy;

public class ApresentacaoResumida implements EstrategiaApresentacao{
    public String apresentar(String noticia) {
        return ("RESUMO: " + noticia.substring(0,33));
    }
}
