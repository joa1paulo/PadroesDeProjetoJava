# Diagrama UML de Classes — Sistema de Vendas

```mermaid
classDiagram
    direction TB

    class VendedorSingleton {
        -VendedorSingleton instance
        -String nome
        -String Endereco
        -String email
        -String ultimoVeiculoVendido
        -double ultimoPrecoFinal
        -EstrategiaDesconto desconto
        -List~ObservadorVenda~ observadores
        -VendedorSingleton()
        +getInstance() VendedorSingleton
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

    VendedorSingleton --> EstrategiaDesconto : utiliza
    EstrategiaDesconto <|.. DescontoNormal : implementa
    EstrategiaDesconto <|.. DescontoPromocional : implementa

    VendedorSingleton "1" o--> "0..*" ObservadorVenda : observadores
    ObservadorVenda <|.. ObservadorEstoque : implementa
    ObservadorVenda <|.. ObservadorFinanceiro : implementa

    ObservadorEstoque --> VendedorSingleton : consulta getters
    ObservadorFinanceiro --> VendedorSingleton : consulta getters

    classDef singleton fill:#17365D,color:#FFFFFF,stroke:#0B1F33,stroke-width:3px
    classDef strategyInterface fill:#E4D7FA,color:#38205E,stroke:#8056B3,stroke-width:2px
    classDef strategyConcrete fill:#F3EAFE,color:#38205E,stroke:#8056B3,stroke-width:2px
    classDef observerInterface fill:#D9EAD3,color:#274E13,stroke:#6AA84F,stroke-width:2px
    classDef observerConcrete fill:#EAF4E5,color:#274E13,stroke:#6AA84F,stroke-width:2px

    class VendedorSingleton singleton
    class EstrategiaDesconto strategyInterface
    class DescontoNormal strategyConcrete
    class DescontoPromocional strategyConcrete
    class ObservadorVenda observerInterface
    class ObservadorEstoque observerConcrete
    class ObservadorFinanceiro observerConcrete
```

**Notas UML:**

* `VendedorSingleton.instance` é estático e `VendedorSingleton()` é privado.
* `getInstance()` também é estático.
* As duas estratégias implementam `EstrategiaDesconto`.
* Os dois observadores implementam `ObservadorVenda`.
* Os observadores mantêm referências a `VendedorSingleton` e consultam `getUltimoVeiculoVendido()` e `getUltimoPrecoFinal()`.

```

### Um detalhe importante

A sintaxe de classes e relacionamentos acima é compatível com Mermaid. Para representar os membros estáticos com rigor, porém, o diagrama precisaria usar a notação específica suportada pela versão do Mermaid instalada no seu renderizador. Os atributos e métodos foram mantidos fiéis ao código enviado.

Se ainda aparecer um erro, envie a nova mensagem e eu corrijo a sintaxe exata que seu renderizador exige.
```
