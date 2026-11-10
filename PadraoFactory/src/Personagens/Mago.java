package Personagens;

public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 80);
    }

    @Override
    public void atacar() {
        System.out.println("[Personagens.Mago] " + getNome() + " conjura uma magia!");
        usarEstrategia();
    }
}
