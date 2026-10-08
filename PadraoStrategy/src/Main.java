import acao.ExplorarAmbiente;
import comunicacao.ComunicarPorWifi;
import locomocao.MoverComEsteiras;
import robots.*;

public static void main(String[] args) {
    ArrayList<Robot> robots = new ArrayList<>();
    Robot r1 = new RobotEntrega();
    Robot r2 = new RobotExplorador();
    Robot r3 = new RobotMedico();
    Robot r4 = new RobotSeguranca();
    Robot r5 = new RobotBombeiro();
    robots.add(r1);robots.add(r2);robots.add(r3);robots.add(r4);robots.add(r5);


    System.out.println("ROBOS INICIAIS");
    System.out.println("===========================");
    for(Robot r : robots){
        System.out.println("robô da classe: " + r.getClass().getName());
        r.acaoPrincipal();
        r.comunicar();
        r.mover();
        System.out.println("===========================");
    }

    System.out.println("");
    System.out.println("ROBO MODIFICADO EM TEMPO DE EXECUÇÃO");

    r4.setacaoPrincipal(new ExplorarAmbiente());
    r4.setComunicacao(new ComunicarPorWifi());
    r4.setLocomocao(new MoverComEsteiras());


    System.out.println("robô da classe: " + r4.getClass().getName());
    r4.acaoPrincipal();
    r4.comunicar();
    r4.mover();
    System.out.println("===========================");
}