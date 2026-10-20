package Strategy;

public class DescontoFuncionario implements EstrategiaDesconto {
    public double precoFinalDesconto(double preco) {
        return (preco * 0.75);
    }
}
