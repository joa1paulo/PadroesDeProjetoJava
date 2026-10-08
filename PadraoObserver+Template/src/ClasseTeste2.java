import Observers.*;
import Strategy.ApresentacaoDetalhada;
import Strategy.ApresentacaoResumida;
import Strategy.ApresentacaoUrgente;
import Subjects.JornalDigital;
import Subjects.LeFigaroDigital;

public class ClasseTeste2 {
    public static void main() {
        String primeiraNoticia = "Uma colmeia de abelhas gigantes, com asas de 30 cm, foi avistada no teto de um prédio no centro de Verdemonte na manhã de hoje; a prefeitura, em nota, garantiu que os insetos são inofensivos e decorativos e que serão removidos em breve, enquanto moradores filmam tudo do chão e apostam em quem consegue a melhor foto.";
        String SegundaNoticia = "Um robô de entrega de pizzas, modelo PizzaBot 3000, fugiu de sua base em São Paulo e foi visto cruzando a Ponte Estaiada a 120 km/h com 47 pizzas a bordo; a empresa PizzaExpress pediu desculpas pelo comportamento excêntrico do protótipo e ofereceu as pizzas de graça a quem conseguisse alcançá-lo, enquanto o robô, segundo câmeras de segurança, parou para comer uma delas sozinho às margens do Rio Pinheiros.";

        System.out.println("================================================================================");

        JornalDigital jornal = new LeFigaroDigital(primeiraNoticia); //CRIAR JORNAL

        AssinanteApp a1 = new AppCelular("joão",new ApresentacaoDetalhada(),jornal);
        jornal.inscrever(a1);
        AssinanteApp a2 = new AppTablet("maria",new ApresentacaoDetalhada(),jornal);
        jornal.inscrever(a2);
        AssinanteApp a3 = new AppWeb("Paulo",new ApresentacaoResumida(),jornal);
        jornal.inscrever(a3);
        AssinanteApp a4 = new AppSmartwatch("JP",new ApresentacaoUrgente(),jornal);
        jornal.inscrever(a4);

        jornal.notificar();

        jornal.cancelar(a2);
        a1.setEstrategia(new ApresentacaoResumida());
        a3.setEstrategia(new ApresentacaoDetalhada());

        System.out.println("=============================================================================");
        System.out.println("DEPOIS DE REMOVER A ASSINANTE MARIA, TROCAR NOTICIA E TROCANDO AS ESTRATEGIAS DE JOAO E PAULO");
        System.out.println("=============================================================================");

        jornal.novaNoticia(SegundaNoticia);//já tem notificar() dentro da função.

    }
}
