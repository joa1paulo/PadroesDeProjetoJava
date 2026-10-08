package robots;

import acao.ExplorarAmbiente;
import comunicacao.ComunicarPorRadio;
import locomocao.MoverComRodas;

public class RobotExplorador extends Robot{

    public RobotExplorador(){
        super.acaoPrincipal = new ExplorarAmbiente();
        super.comunicacao = new ComunicarPorRadio();
        super.locomocao = new MoverComRodas();
    }
}
