package Strategy;

public class ApresentacaoUrgente implements EstrategiaApresentacao{
    public String apresentar(String noticia) {
        return ("URGENTE: " + noticia.substring(0,33).toUpperCase());
    }
}
