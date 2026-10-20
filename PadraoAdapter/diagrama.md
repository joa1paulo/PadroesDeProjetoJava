```
classDiagram
    direction TB

    %% Definição de Cores
    classDef singleton fill:#FFE082,stroke:#333,stroke-width:2px;
    classDef template fill:#FFAB91,stroke:#333,stroke-width:2px;
    classDef adapter fill:#90CAF9,stroke:#333,stroke-width:2px;
    classDef strategy fill:#A5D6A7,stroke:#333,stroke-width:2px;
    classDef observer fill:#CE93D8,stroke:#333,stroke-width:2px;
    classDef main fill:#E0E0E0,stroke:#333,stroke-width:2px;

    %% Singleton
    class Vendedor {
        - static Vendedor instancia
        - Vendedor()
        + static Vendedor getInstancia()
    }

    %% Template Method
    class ProcessamentoVenda {
        <<abstract>>
        + processarVenda()
        # calcularPreco()
        # notificar()
    }
    class VendaOnline {
        + calcularPreco()
        + notificar()
    }
    class VendaPresencial {
        + calcularPreco()
        + notificar()
    }

    %% Adapter
    class Documento {
        <<interface>>
        + imprimir()
    }
    class DocumentoHtml {
        + imprimir()
    }
    class DocumentoPdf {
        - ComponentePdf componentePdf
        + imprimir()
    }
    class ComponentePdf {
        + pdfSpecificRender()
    }

    %% Estrategias (Strategy)
    class EstrategiaDesconto {
        <<interface>>
        + calcularDesconto(double valor) double
    }
    class DescontoNormal {
        + calcularDesconto(double valor) double
    }
    class DescontoPromocional {
        + calcularDesconto(double valor) double
    }

    %% Observador (Observer)
    class ObservadorVenda {
        <<interface>>
        + atualizar()
    }
    class Estoque {
        + atualizar()
    }
    class Financeiro {
        + atualizar()
    }

    %% Programa Principal
    class Programa {
        + main(String[] args)
    }

    %% Relacionamentos de Herança e Implementação
    VendaOnline --|> ProcessamentoVenda : herda
    VendaPresencial --|> ProcessamentoVenda : herda

    DocumentoHtml ..|> Documento : implementa
    DocumentoPdf ..|> Documento : implementa
    DocumentoPdf --> ComponentePdf : adapta

    DescontoNormal ..|> EstrategiaDesconto : implementa
    DescontoPromocional ..|> EstrategiaDesconto : implementa

    Estoque ..|> ObservadorVenda : implementa
    Financeiro ..|> ObservadorVenda : implementa

    %% Aplicando Estilos nas Classes
    class Vendedor singleton
    class ProcessamentoVenda template
    class VendaOnline template
    class VendaPresencial template
    class Documento adapter
    class DocumentoHtml adapter
    class DocumentoPdf adapter
    class ComponentePdf adapter
    class EstrategiaDesconto strategy
    class DescontoNormal strategy
    class DescontoPromocional strategy
    class ObservadorVenda observer
    class Estoque observer
    class Financeiro observer
    class Programa main

```



