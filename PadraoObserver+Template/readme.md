# Observer e Strategy

O diagrama mostra principalmente como o padrão **Observer** é usado para distribuir notícias do jornal aos aplicativos inscritos. O padrão **Strategy** aparece como apoio: cada aplicativo pode escolher como apresentar a notícia.

```mermaid
classDiagram
    direction LR

    class JornalDigital {
        <<Subject>>
        noticiaAtual: String
        inscrever(AssinanteApp)
        cancelar(AssinanteApp)
        notificar()
        novaNoticia(String)
        getNoticiaAtual() String
    }

    class LeFigaroDigital
    class AssinanteApp {
        <<Observer>>
        atualiza()
        setEstrategia(EstrategiaApresentacao)
    }

    class AppCelular
    class AppTablet
    class AppWeb
    class AppSmartwatch

    class EstrategiaApresentacao {
        <<Strategy>>
        apresentar(String) String
    }

    class ApresentacaoDetalhada
    class ApresentacaoResumida
    class ApresentacaoUrgente

    JornalDigital <|-- LeFigaroDigital
    JornalDigital "1" --> "0..*" AssinanteApp : inscreve e notifica

    AssinanteApp <|.. AppCelular
    AssinanteApp <|.. AppTablet
    AssinanteApp <|.. AppWeb
    AssinanteApp <|.. AppSmartwatch

    AppCelular --> JornalDigital : consulta notícia
    AppTablet --> JornalDigital : consulta notícia
    AppWeb --> JornalDigital : consulta notícia
    AppSmartwatch --> JornalDigital : consulta notícia

    EstrategiaApresentacao <|.. ApresentacaoDetalhada
    EstrategiaApresentacao <|.. ApresentacaoResumida
    EstrategiaApresentacao <|.. ApresentacaoUrgente

    AppCelular --> EstrategiaApresentacao : apresentação configurável
    AppTablet --> EstrategiaApresentacao : apresentação configurável
    AppWeb --> EstrategiaApresentacao : apresentação configurável
    AppSmartwatch --> EstrategiaApresentacao : apresentação configurável
```

Quando `novaNoticia` é chamada, `JornalDigital` atualiza a notícia e chama `notificar()`. Cada `AssinanteApp` inscrito recebe `atualiza()`, consulta a notícia atual e a apresenta usando sua estratégia configurada. `cancelar()` remove o aplicativo da lista de notificações.