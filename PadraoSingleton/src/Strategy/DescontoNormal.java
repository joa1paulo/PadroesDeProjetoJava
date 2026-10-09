package Strategy;

public class DescontoNormal implements EstrategiaDesconto {

    @Override
    public double precoFinalDesconto(double preco) {
        return (preco - 500);
    }
}
