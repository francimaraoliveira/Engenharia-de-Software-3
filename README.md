# Engenharia-de-Software-3


##Princípio Tell, Don't Ask 
Este princípio parte da ideia que seu método não deve pedir para ser executado, ele deve tomar suas próprias decisões.
E para que o código seja executado é realizado alguns if's antes para poder tomar uma decisão.
Usando este princípio o código ficou simples, claro e escalável e aumenta o encapsulamento deixando tudo dentro do método calcular() e foram retirados os métodos getValor1 e getValor2. 

##Princípio Fail First
 É um outro importante princípio que se resume em mostrar o erro o mais rápido possível.

```
if(this.valor1 ==0 || this.valor2 == 0 ) {
    throw new RuntimeException("Não é possível calcular.");
}
```

A grande vantagem dele é que fazemos todas as nossas validações antes melhorando o código para poder implementar a regra de negócio.
O Fail First parte do princípio que else não é muito necessário, e é removido do código.















