package Singleton;

import Estrategias.EstrategiaDesconto;
import Observador.ObservadorVenda;
import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private static Vendedor instancia;
    private EstrategiaDesconto estrategia;
    private final List<ObservadorVenda> observadores = new ArrayList<>();
    private String ultimoVeiculoVendido;
    private double ultimoPrecoFinal;

    private Vendedor() {
    }

    public static Vendedor getInstance() {
        if (instancia == null) {
            instancia = new Vendedor();
        }
        return instancia;
    }

    public void setEstrategia(EstrategiaDesconto estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularPrecoFinal(double preco) {
        if (estrategia == null) {
            throw new IllegalStateException("Uma estratégia de desconto deve ser configurada antes da venda.");
        }
        return estrategia.calcular(preco);
    }

    public void adicionarObservador(ObservadorVenda observador) {
        observadores.add(observador);
    }

    public void removerObservador(ObservadorVenda observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (ObservadorVenda observador : new ArrayList<>(observadores)) {
            observador.atualizar();
        }
    }

    public String getUltimoVeiculoVendido() {
        return ultimoVeiculoVendido;
    }

    public double getUltimoPrecoFinal() {
        return ultimoPrecoFinal;
    }

    public void concluirVenda(String veiculo, double precoFinal) {
        this.ultimoVeiculoVendido = veiculo;
        this.ultimoPrecoFinal = precoFinal;
        notificarObservadores();
    }
}
