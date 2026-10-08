# Padrão Template Method (Template)

Este projeto implementa o padrão de projeto Template Method, em que a classe abstrata `Robot` define o algoritmo padrão da missão, enquanto as subclasses fornecem as etapas específicas de cada tipo de robô.

## Estrutura do padrão

O método `executarMissao()` na classe `Robot` é o "template" que define a sequência fixa de execução:

1. `iniciarSistemas()`
2. `locomover()`
3. `comunicar()`
4. `executarAcao()`
5. `finalizarMissao()`
6. `gerarRelatorio()` quando `deveGerarRelatorio()` retornar `true`

As subclasses sobrescrevem apenas os comportamentos variáveis, mantendo o fluxo principal inalterado.

```mermaid
classDiagram
    class TesteRobos {
        +main(args: String[]) : void
    }

    class Robot {
        <<abstract>>
        +executarMissao() : void
        +iniciarSistemas() : void
        +finalizarMissao() : void
        +gerarRelatorio() : void
        +deveGerarRelatorio() : boolean
        {abstract} +locomover() : void
        {abstract} +comunicar() : void
        {abstract} +executarAcao() : void
    }

    class RoboEntrega {
        +locomover() : void
        +comunicar() : void
        +executarAcao() : void
        +deveGerarRelatorio() : boolean
    }

    class RoboExplorador {
        +locomover() : void
        +comunicar() : void
        +executarAcao() : void
    }

    class RoboMedico {
        +locomover() : void
        +comunicar() : void
        +executarAcao() : void
    }

    class RoboSeguranca {
        +locomover() : void
        +comunicar() : void
        +executarAcao() : void
    }

    class RoboBombeiro {
        +locomover() : void
        +comunicar() : void
        +executarAcao() : void
    }

    TesteRobos --> Robot : cria e executa
    Robot <|-- RoboEntrega
    Robot <|-- RoboExplorador
    Robot <|-- RoboMedico
    Robot <|-- RoboSeguranca
    Robot <|-- RoboBombeiro
```

## Observação sobre o hook method

A classe `RoboEntrega` sobrescreve `deveGerarRelatorio()` para retornar `false`, demonstrando o uso de um hook method: um ponto de extensão do algoritmo template para alterar o comportamento sem mexer na estrutura principal da missão.

## Exemplo de fluxo

No código principal, um array de robôs é criado e cada um executa a mesma sequência de missão, embora com ações específicas:

- `RoboEntrega`: entrega pacote
- `RoboExplorador`: explora ambiente
- `RoboMedico`: presta socorro
- `RoboSeguranca`: vigia a área
- `RoboBombeiro`: apaga incêndio
