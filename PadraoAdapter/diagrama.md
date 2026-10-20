```mermaid
classDiagram
    direction TB

    %% Definição de Cores Modernas e Claras (estilo ferramenta de diagrama)
    classDef singleton fill:#FFE082,stroke:#FBC02D,stroke-width:1.5px,rx:6,ry:6,color:#333;
    classDef template fill:#FFCC80,stroke:#FB8C00,stroke-width:1.5px,rx:6,ry:6,color:#333;
    classDef adapter fill:#90CAF9,stroke:#1E88E5,stroke-width:1.5px,rx:6,ry:6,color:#333;
    classDef strategy fill:#A5D6A7,stroke:#43A047,stroke-width:1.5px,rx:6,ry:6,color:#333;
    classDef observer fill:#CE93D8,stroke:#8E24AA,stroke-width:1.5px,rx:6,ry:6,color:#333;
    classDef main fill:#EEEEEE,stroke:#616161,stroke-width:1.5px,rx:6,ry:6,color:#333;
    classDef interface fill:#FFFFFF,stroke:#757575,stroke-width:2px,stroke-dasharray: 5 5,rx:4,ry:4,color:#333;

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

    %% Relacionamentos de Herança e Implementação (Setas Simples)
    VendaOnline --|> ProcessamentoVenda : "herda"
    VendaPresencial --|> ProcessamentoVenda : "herda"

    DocumentoHtml ..|> Documento : "implementa"
    DocumentoPdf ..|> Documento : "implementa"
    DocumentoPdf --> ComponentePdf : "adapta"

    DescontoNormal ..|> EstrategiaDesconto : "implementa"
    DescontoPromocional ..|> EstrategiaDesconto : "implementa"

    Estoque ..|> ObservadorVenda : "implementa"
    Financeiro ..|> ObservadorVenda : "implementa"

    %% Aplicando Estilos Modernos nas Classes
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
    
    %% Estilo específico para interfaces (tracejado)
    class Documento interface
    class EstrategiaDesconto interface
    class ObservadorVenda interface
