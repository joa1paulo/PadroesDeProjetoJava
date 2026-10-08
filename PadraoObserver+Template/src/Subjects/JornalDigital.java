package Subjects;

import Observers.AssinanteApp;

import java.util.ArrayList;

public abstract class JornalDigital {
    ArrayList<AssinanteApp> apps = new ArrayList<>();
    protected String noticiaAtual;

    public void inscrever(AssinanteApp j){
        apps.add(j);
    }

    public void cancelar(AssinanteApp j){
        apps.remove(j);
    }

    public void notificar(){
        for(AssinanteApp app : apps){
            app.atualiza();
        }
    }

    public String getNoticiaAtual(){
        return noticiaAtual;
    }

    public void novaNoticia(String noticia){
        noticiaAtual = noticia;
        notificar();
    }

}
