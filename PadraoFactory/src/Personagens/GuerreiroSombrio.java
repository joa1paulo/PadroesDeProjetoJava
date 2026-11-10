package Personagens;

public class GuerreiroSombrio extends Personagem {
    public GuerreiroSombrio(String nome) {
        super(nome, 120);
    }

    @Override
    public void atacar() {
        System.out.println("[Personagens.Guerreiro] Sombrio " + getNome() + " empunha a espada das TREVAS!");
        usarEstrategia();
    }
}
