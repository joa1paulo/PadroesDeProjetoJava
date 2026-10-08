package robots;

import acao.ApagarIncendio;
import comunicacao.ComunicarPorSatelite;
import locomocao.MoverNaAgua;

public class RobotBombeiro extends Robot{

    public RobotBombeiro(){
        super.locomocao = new MoverNaAgua();
        super.comunicacao = new ComunicarPorSatelite();
        super.acaoPrincipal = new ApagarIncendio();
    }
}
