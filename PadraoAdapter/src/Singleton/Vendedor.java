package Singleton;

import Estrategias.EstrategiaDesconto;
import Observador.ObservadorVenda;

import java.util.ArrayList;

public class Vendedor {
    private static Vendedor instancia = new Vendedor();
    EstrategiaDesconto estrategia;
    ArrayList<ObservadorVenda> observadores = new ArrayList<>();
    private String UltimoVeiculoVendido;
    private Double UltimoValorVendido;

    private Vendedor(){
    }

    public static Vendedor getInstance() {
        if (instancia == null) {
            System.out.println("Inicializando novo Vendedor");
            instancia = new Vendedor();
        }
        else System.out.println("Nova referencia de vendedor(mesma instancia)");
        return instancia;
    }

    public void setEstrategia(EstrategiaDesconto estrategia) {
        this.estrategia = estrategia;
    }

    public double CalcularPrecoVendedor(double preco){
        return estrategia.calcular(preco);
    }

    public void adicionarObservador(ObservadorVenda observador){
        observadores.add(observador);
    }

    public void removerObservador(ObservadorVenda observador){
        observadores.remove(observador);
    }

    public void notificarObservadores(){
        for(ObservadorVenda observador: observadores){
            observador.atualizar();
        }
    }
    public String getUltimoVeiculoVendido(){
        return UltimoVeiculoVendido;
    }

    public Double getUltimoValorVendido(){
        return UltimoValorVendido;
    }

    public void ConcluirVenda(String veiculo,double preco){//somente o template puxa esse metodo
        this.UltimoVeiculoVendido = veiculo;
        this.UltimoValorVendido = preco;
        notificarObservadores();
    }
}
