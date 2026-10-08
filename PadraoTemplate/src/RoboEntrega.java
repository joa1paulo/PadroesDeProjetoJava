public class RoboEntrega extends Robot{
    public void locomover(){
        System.out.println("Movendo com rodas");
    }
    public void comunicar(){
        System.out.println("Comunicando por wifi");
    }
    public void executarAcao(){
        System.out.println("Entregando pacote");
    }
    public boolean deveGerarRelatorio(){ //hook
        return false;
    }
}
