package robots;

import acao.acaoPrincipal;
import comunicacao.comunicacao;
import locomocao.locomocao;

public abstract class Robot {
    protected locomocao locomocao;
    protected comunicacao comunicacao;
    protected acaoPrincipal acaoPrincipal;

    public void mover(){
        locomocao.mover();
    };
    public void comunicar(){
        comunicacao.comunicar();
    };
    public void acaoPrincipal(){
        acaoPrincipal.acao();
    };

    public void setLocomocao(locomocao locomocao){
        this.locomocao = locomocao;
    }
    public void setComunicacao(comunicacao comunicacao){
        this.comunicacao = comunicacao;
    }
    public void setacaoPrincipal(acaoPrincipal acaoPrincipal){
        this.acaoPrincipal = acaoPrincipal;
    }
}



