package Subjects;

import Observers.AssinanteApp;

import java.util.ArrayList;

public class LeFigaroDigital extends JornalDigital{
    ArrayList<AssinanteApp> assinantes = new ArrayList<AssinanteApp>();

    public LeFigaroDigital(String noticiaAtual){
        super.noticiaAtual = noticiaAtual;
    }

}
