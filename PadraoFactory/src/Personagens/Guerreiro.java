package Personagens;

public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 120);
    }

    @Override
    public void atacar() {
        System.out.println("[Personagens.Guerreiro] " + getNome() + " empunha a espada!");
        usarEstrategia();
    }
}
