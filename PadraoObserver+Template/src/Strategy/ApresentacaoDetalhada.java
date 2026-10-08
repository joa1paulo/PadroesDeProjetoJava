package Strategy;

public class ApresentacaoDetalhada implements EstrategiaApresentacao{
    public String apresentar(String noticia) {
        return ("NOTICIA: " + noticia);
    }
}
