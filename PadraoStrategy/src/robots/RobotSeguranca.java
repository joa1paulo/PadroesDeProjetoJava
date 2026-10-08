package robots;


import acao.VigiarArea;
import comunicacao.ComunicarPorRadio;
import locomocao.MoverComRodas;

public class RobotSeguranca extends Robot{

    public RobotSeguranca(){
        super.acaoPrincipal = new VigiarArea();
        super.comunicacao = new ComunicarPorRadio();
        super.locomocao = new MoverComRodas();
    }
}
