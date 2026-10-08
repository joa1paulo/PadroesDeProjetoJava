public class TesteRobos {
     public static void main(String[] args) {
        Robot[] robos = {new RoboEntrega(), new RoboExplorador(), new RoboMedico(), new RoboSeguranca(),new RoboBombeiro()
        };

        for (Robot r : robos) {
            System.out.println(r.getClass().getSimpleName());
            r.executarMissao();
            System.out.println("=====================");
        }
    }
}
