package Observers;

import Strategy.EstrategiaApresentacao;
import Subjects.JornalDigital;

public class AppTablet implements AssinanteApp{
    String nomeUser;
    EstrategiaApresentacao estrategiaApresentacao;
    JornalDigital jornal;

    public AppTablet(String nomeUser,EstrategiaApresentacao estrategia,JornalDigital  jornal){
        this.nomeUser = nomeUser;
        this.estrategiaApresentacao = estrategia;
        this.jornal = jornal;
    }

    public void setEstrategia(EstrategiaApresentacao estrategiaApresentacao) {
        this.estrategiaApresentacao = estrategiaApresentacao;
    }

    public void atualiza() {
        System.out.println(nomeUser + " atualizando " + estrategiaApresentacao.apresentar(jornal.getNoticiaAtual()));
        System.out.println("\n");
    }
}