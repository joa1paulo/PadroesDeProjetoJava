package Personagens;
import Strategy.EstrategiaAtaque;

public abstract class Personagem {
    private String nome;
    private int vida;
    private EstrategiaAtaque estrategia;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setEstrategiaAtaque(EstrategiaAtaque estrategia) {
        this.estrategia = estrategia;
    }

    protected void usarEstrategia() {
        if (estrategia != null) {
            estrategia.atacar(nome);
        } else {
            System.out.println(nome + " ainda não possui estratégia de ataque.");
        }
    }

    public abstract void atacar();
}
