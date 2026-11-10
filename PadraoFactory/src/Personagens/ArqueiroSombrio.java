package Personagens;

public class ArqueiroSombrio extends Personagem {
    public ArqueiroSombrio(String nome) {
        super(nome, 90);
    }

    @Override
    public void atacar() {
        System.out.println("[Personagens.Arqueiro] Sombrio " + getNome() + " dispara uma flechas das TREVAS com o arco!");
        usarEstrategia();
    }
}
