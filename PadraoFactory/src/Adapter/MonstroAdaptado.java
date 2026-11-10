package Adapter;

import Personagens.Personagem;

public class MonstroAdaptado extends Personagem {
    private MonstroAntigo legado;

    public MonstroAdaptado(String nome, MonstroAntigo legado) {
        super(nome, 150);
        this.legado = legado;
    }

    @Override
    public void atacar() {
        legado.executarGolpeAntigo();
    }
}
