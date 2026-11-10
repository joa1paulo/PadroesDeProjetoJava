package Strategy;

public class AtaqueNormal implements EstrategiaAtaque {
    @Override
    public void atacar(String nome) {
        System.out.println(nome + " executa um ataque normal.");
    }
}
