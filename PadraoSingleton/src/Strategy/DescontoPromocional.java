package Strategy;

public class DescontoPromocional implements EstrategiaDesconto{

    @Override
    public double precoFinalDesconto(double preco) {
        return preco * 0.8;
    }
}
