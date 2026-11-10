package FactoryAndTemplate;
import Adapter.*;
import Personagens.*;

public class ArenaSombria extends ArenaRPG {
    @Override
    protected Personagem criarPersonagem(String tipo, String nome) {
        if (tipo == null) {
            throw new IllegalArgumentException("Tipo de personagem desconhecido: null");
        }
        switch (tipo) {
            case "guerreiro":
                return new GuerreiroSombrio(nome);
            case "mago":
                return new MagoSombrio(nome);
            case "arqueiro":
                return new ArqueiroSombrio(nome);
            case "monstro":
                return new MonstroAdaptado(nome, new MonstroAntigo());
            default:
                throw new IllegalArgumentException("Tipo de personagem desconhecido: " + tipo);
        }
    }

    public void exibirAbertura(){
        System.out.println("1-Abrindo Arena Sombria");
    }
    public void executarRitual(){
        System.out.println("1-Executando Ritual Sombrio");
        System.out.println("1-Evocando as trevas");
        System.out.println("2-Intimidando Oponentes");
        System.out.println("3-Banhando a arena em sombra");
    }
    public void exibirEncerramentos(){
        System.out.println("Encerrando Arena Sombria");
    }


}
