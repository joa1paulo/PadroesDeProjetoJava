package FactoryAndTemplate;

import Personagens.Personagem;

import java.util.ArrayList;
import java.util.List;

public abstract class ArenaRPG {
    private final List<Personagem> personagens = new ArrayList<>();
    protected abstract Personagem criarPersonagem(String tipo, String nome);

    public Personagem adicionarPersonagem(String tipo, String nome) {
        Personagem p = criarPersonagem(tipo, nome);
        personagens.add(p);
        return p;
    }

    public void executarAtaques() {
        for (Personagem p : personagens) {
            p.atacar();
        }
    }

    public void iniciarCombate(){
        exibirAbertura();
        executarRitual();
        executarAtaques();
        exibirEncerramentos();
    }

    public abstract void exibirAbertura();
    public abstract void executarRitual();
    public abstract void exibirEncerramentos();
}
