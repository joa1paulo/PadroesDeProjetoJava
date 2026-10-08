public abstract class Robot {
    final public void  executarMissao(){
        iniciarSistemas();
        locomover();
        comunicar();
        executarAcao();
        finalizarMissao();

        if(deveGerarRelatorio()){
            gerarRelatorio();
        }
    }

    public void iniciarSistemas(){
        System.out.println("Iniciando Sistemas");
    }
    public void finalizarMissao(){
        System.out.println("Finalizando Sistemas");
    }
    public void gerarRelatorio(){
        System.out.println("Gerando relatorio");
    }
    public boolean deveGerarRelatorio(){ //pode ser sobrescrita
        return true;
    }

    public abstract void locomover();
    public abstract void comunicar();
    public abstract void executarAcao();
}
