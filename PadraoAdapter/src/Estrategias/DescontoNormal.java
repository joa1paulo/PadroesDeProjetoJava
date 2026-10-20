package Estrategias;

public class DescontoNormal implements EstrategiaDesconto {
    public double calcular(double preco) {
        return preco * 0.95;
    }
}
