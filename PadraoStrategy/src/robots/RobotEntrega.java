package robots;

import acao.EntregarPacote;
import comunicacao.ComunicarPorRadio;
import locomocao.MoverComEsteiras;

public class RobotEntrega extends Robot{

    public RobotEntrega(){
        super.acaoPrincipal = new EntregarPacote();
        super.comunicacao = new ComunicarPorRadio();
        super.locomocao = new MoverComEsteiras();
    }
}
