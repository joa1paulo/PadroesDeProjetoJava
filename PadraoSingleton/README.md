```mermaid
classDiagram
    direction TB

    class VendedorSingleton {
        -VendedorSingleton instance$
        -String nome
        -String Endereco
        -String email
        -String ultimoVeiculoVendido
        -double ultimoPrecoFinal
        -EstrategiaDesconto desconto
        -List~ObservadorVenda~ observadores
        -VendedorSingleton()
        +getInstance() VendedorSingleton$
        +setNome(String) void
        +setEndereco(String) void
        +setEmail(String) void
        +exibir(VendedorSingleton) boolean
        +setEstrategia(EstrategiaDesconto) void
        +calcularPrecoFinal(double) double
        +adicionarObservador(ObservadorVenda) void
        +removerObservador(ObservadorVenda) void
        +notificarObservadores() void
        +getUltimoVeiculoVendido() String
        +getUltimoPrecoFinal() double
        +concluirVenda(String, double) void
    }

    class EstrategiaDesconto {
        <<interface>>
        +precoFinalDesconto(double) double
    }

    class DescontoNormal {
        +precoFinalDesconto(double) double
    }

    class DescontoPromocional {
        +precoFinalDesconto(double) double
    }

    class ObservadorVenda {
        <<interface>>
        +atualizar() void
    }

    class ObservadorEstoque {
        -VendedorSingleton vendedor
        +ObservadorEstoque(VendedorSingleton)
        +atualizar() void
    }

    class ObservadorFinanceiro {
        -VendedorSingleton vendedor
        +ObservadorFinanceiro(VendedorSingleton)
        +atualizar() void
    }

    %% Singleton
    classDef singleton fill:#17365D,color:#FFFFFF,stroke:#0B1F33,stroke-width:3px

    %% Strategy
    classDef strategyInterface fill:#E4D7FA,color:#38205E,stroke:#8056B3,stroke-width:2px
    classDef strategyConcrete fill:#F3EAFE,color:#38205E,stroke:#8056B3,stroke-width:1.5px

    %% Observer
    classDef observerInterface fill:#D9EAD3,color:#274E13,stroke:#6AA84F,stroke-width:2px
    classDef observerConcrete fill:#EAF4E5,color:#274E13,stroke:#6AA84F,stroke-width:1.5px

    class VendedorSingleton singleton
    class EstrategiaDesconto strategyInterface
    class DescontoNormal,DescontoPromocional strategyConcrete
    class ObservadorVenda observerInterface
    class ObservadorEstoque,ObservadorFinanceiro observerConcrete

    %% Relacionamentos do Strategy
    VendedorSingleton --> EstrategiaDesconto : utiliza
    EstrategiaDesconto <|.. DescontoNormal : implementa
    EstrategiaDesconto <|.. DescontoPromocional : implementa

    %% Relacionamentos do Observer
    VendedorSingleton "1" o--> "0..*" ObservadorVenda : mantém coleção
    ObservadorVenda <|.. ObservadorEstoque : implementa
    ObservadorVenda <|.. ObservadorFinanceiro : implementa

    %% Referências dos observadores ao sujeito
    ObservadorEstoque --> VendedorSingleton : consulta getters
    ObservadorFinanceiro --> VendedorSingleton : consulta getters
```

