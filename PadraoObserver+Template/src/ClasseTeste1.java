import Observers.AppCelular;
import Observers.AppTablet;
import Observers.AppWeb;
import Observers.AssinanteApp;
import Strategy.ApresentacaoDetalhada;
import Strategy.ApresentacaoResumida;
import Subjects.JornalDigital;
import Subjects.LeFigaroDigital;

public class ClasseTeste1 {
    public static void main() {
        String primeiraNoticia = "Uma colmeia de abelhas gigantes, com asas de 30 cm, foi avistada no teto de um prédio no centro de Verdemonte na manhã de hoje; a prefeitura, em nota, garantiu que os insetos são inofensivos e decorativos e que serão removidos em breve, enquanto moradores filmam tudo do chão e apostam em quem consegue a melhor foto.";

        System.out.println("================================================================================");

        JornalDigital jornal = new LeFigaroDigital(primeiraNoticia); //CRIAR JORNAL

        AssinanteApp a1 = new AppCelular("joão",new ApresentacaoDetalhada(),jornal);
        jornal.inscrever(a1);
        AssinanteApp a2 = new AppTablet("maria",new ApresentacaoDetalhada(),jornal);
        jornal.inscrever(a2);
        AssinanteApp a3 = new AppWeb("Paulo",new ApresentacaoResumida(),jornal);
        jornal.inscrever(a3);

        jornal.notificar();


    }
}