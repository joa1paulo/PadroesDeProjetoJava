package Singleton;

import Observer.ObservadorVenda;
import Strategy.EstrategiaDesconto;

import java.util.ArrayList;
import java.util.List;

public class VendedorSingleton {
    private static VendedorSingleton instance;
    private String nome,Endereco,email,ultimoVeiculoVendido;
    private double ultimoPrecoFinal;
    private EstrategiaDesconto desconto;
    List<ObservadorVenda> observadores = new ArrayList<ObservadorVenda>();


    private VendedorSingleton() {};

    public static VendedorSingleton getInstance() {
        if (instance == null) {
            System.out.println("Inicializando novo Vendedor");
            instance = new VendedorSingleton();
        }
        else System.out.println("Nova referencia de vendedor(mesma instancia)");
        return instance;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.Endereco = endereco;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public boolean exibir(VendedorSingleton vendedor) {
        return vendedor == this;
    }

    public void setEstrategia(EstrategiaDesconto estrategiadesconto) {
        this.desconto = estrategiadesconto;
    }

    public double calcularPrecoFinal(double preco){
        return desconto.precoFinalDesconto(preco);
    }

    public void adicionarObservador(ObservadorVenda observador){
        observadores.add(observador);
    }

    public void removerObservador(ObservadorVenda observador){
        observadores.remove(observador);
    }

    public void notificarObservadores(){
        for (ObservadorVenda observador : observadores) {
            observador.atualizar();
        }
    }

    public String getUltimoVeiculoVendido() {
        return ultimoVeiculoVendido;
    }

    public double getUltimoPrecoFinal() {
        return ultimoPrecoFinal;
    }

    public void concluirVenda(String Veiculo,double Preco){
        double precoFinal = calcularPrecoFinal(Preco);
        this.ultimoVeiculoVendido = Veiculo;
        this.ultimoPrecoFinal = precoFinal;
        notificarObservadores();
    }

}
