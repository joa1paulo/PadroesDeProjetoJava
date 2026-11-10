package Strategy;

public class AtaqueEspecial implements EstrategiaAtaque {
    @Override
    public void atacar(String nome) {
        System.out.println(nome + " executa um ataque ESPECIAL!");
    }
}
