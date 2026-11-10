import FactoryAndTemplate.*;
import Personagens.*;
import Strategy.*;

import java.util.Scanner;


public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArenaRPG arena = new ArenaClassica();
        String[] tipos = {"guerreiro", "mago", "arqueiro"};
        Personagem[] personagensClassicos = new Personagem[tipos.length];
        Personagem guerreiro = null;

        // Cenário 1: criação pela fábrica, estratégia normal e ataques polimórficos
        System.out.println("=== Cenário 1: criação e ataques da arena ===");
        for (int i = 0; i < tipos.length; i++) {
            String tipo = tipos[i];
            System.out.print("Nome do " + tipo + ": ");
            String nome = scanner.nextLine();
            Personagem p = arena.adicionarPersonagem(tipo, nome);
            p.setEstrategiaAtaque(new AtaqueNormal());
            personagensClassicos[i] = p;
            if (tipo.equals("guerreiro")) {
                guerreiro = p;
            }
        }
        arena.iniciarCombate();


        System.out.println("\n=== Cenário 2: troca de estratégia ===");
        guerreiro.atacar();
        guerreiro.setEstrategiaAtaque(new AtaqueEspecial());
        guerreiro.atacar();

        // Cenário 3: monstro legado adaptado
        System.out.println("\n=== Cenário 3: monstro (Adapter) ===");
        Personagem monstro = arena.adicionarPersonagem("monstro", "Monstro Sombrio");
        monstro.setEstrategiaAtaque(new AtaqueNormal());
        monstro.atacar();

        System.out.println("\n=== Cenário 4: personagens da arena sombria ===");
        arena = new ArenaSombria();
        String[] tiposSombrios = {"guerreiro", "mago", "arqueiro", "monstro"};
        Personagem[] personagensSombrios = new Personagem[tiposSombrios.length];
        for (int i = 0; i < tiposSombrios.length; i++) {
            String tipo = tiposSombrios[i];
            System.out.print("Nome do " + tipo + " sombrio: ");
            String nome = scanner.nextLine();
            Personagem p = arena.adicionarPersonagem(tipo, nome);
            p.setEstrategiaAtaque(new AtaqueNormal());
            personagensSombrios[i] = p;
        }
        arena.iniciarCombate();

        Personagem[] personagensClassicosComparaveis = {
                personagensClassicos[0], personagensClassicos[1],
                personagensClassicos[2], monstro
        };
        System.out.println("\nComparação dos produtos por tipo:");
        for (int i = 0; i < tiposSombrios.length; i++) {
            Personagem classico = personagensClassicosComparaveis[i];
            Personagem sombrio = personagensSombrios[i];
            System.out.println(tiposSombrios[i] + ": "
                    + classico.getClass().getSimpleName() + " vs "
                    + sombrio.getClass().getSimpleName()
                    + " (mesma classe concreta? " + classico.getClass().equals(sombrio.getClass())
                    + "; mesma instância? " + (classico == sombrio) + ")");
        }

        scanner.close();
    }
}
