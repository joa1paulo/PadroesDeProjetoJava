package robots;

import acao.PrestarSocorro;
import comunicacao.ComunicarPorWifi;
import locomocao.MoverComEsteiras;

public class RobotMedico extends Robot{

    public RobotMedico(){
        super.acaoPrincipal = new PrestarSocorro();
        super.comunicacao = new ComunicarPorWifi();
        super.locomocao = new MoverComEsteiras();
    }
}
