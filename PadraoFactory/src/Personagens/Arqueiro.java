package Personagens;

public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, 90);
    }

    @Override
    public void atacar() {
        System.out.println("[Personagens.Arqueiro] " + getNome() + " dispara uma flecha com o arco!");
        usarEstrategia();
    }
}
