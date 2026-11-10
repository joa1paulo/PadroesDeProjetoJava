package Personagens;

public class MagoSombrio extends Personagem {
    public MagoSombrio(String nome) {
        super(nome, 80);
    }

    @Override
    public void atacar() {
        System.out.println("[Personagens.Mago] Sombrio " + getNome() + " conjura uma magia das TREVAS!");
        usarEstrategia();
    }
}
