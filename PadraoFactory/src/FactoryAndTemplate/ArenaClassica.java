package FactoryAndTemplate;

import Adapter.*;
import Personagens.Arqueiro;
import Personagens.Guerreiro;
import Personagens.Mago;
import Personagens.Personagem;

public class ArenaClassica extends ArenaRPG {
    @Override
    protected Personagem criarPersonagem(String tipo, String nome) {
        if (tipo == null) {
            throw new IllegalArgumentException("Tipo de personagem desconhecido: null");
        }
        switch (tipo) {
            case "guerreiro":
                return new Guerreiro(nome);
            case "mago":
                return new Mago(nome);
            case "arqueiro":
                return new Arqueiro(nome);
            case "monstro":
                return new MonstroAdaptado(nome, new MonstroAntigo());
            default:
                throw new IllegalArgumentException("Tipo de personagem desconhecido: " + tipo);
        }
    }

    public void exibirAbertura(){
        System.out.println("Abrindo Arena Da Luz");
    }
    public void executarRitual(){
        System.out.println("Executando Ritual Da Luz");
        System.out.println("1-Saudando os Combatentes");
        System.out.println("2-invocando a plateia");
        System.out.println("3-Erguendo Estandartes");
    }
    public void exibirEncerramentos(){
        System.out.println("Encerrando Arena Da Luz");
    }
}
