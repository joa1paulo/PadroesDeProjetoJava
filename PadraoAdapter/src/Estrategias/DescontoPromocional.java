package Estrategias;

public class DescontoPromocional implements EstrategiaDesconto {
    @Override
    public double calcular(double preco) {
        return preco * 0.80;
    }
}
