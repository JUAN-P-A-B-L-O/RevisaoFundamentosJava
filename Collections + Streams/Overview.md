Collections

3 interfaces padroes e suas implementações

![alt text](/Collections%20+%20Streams/assets/image.png)


Stream API 

• Intermediate ops are lazy — they don’t run yet.

stream.filter(n -> n > 10); // nothing executed


• They return another Stream — so you can chain.

stream.filter(n -> n > 10).map(n -> n * 2);


• Terminal ops execute everything — and give the result.

stream.filter(n -> n > 10)
.map(n -> n * 2)
.count(); // now it runs





• stream()
Transforma a lista em um “fluxo” de dados para processar.

• Operações intermediárias (filter, map...)
Montam a sequência de passos, mas não executam nada ainda.

• Operação terminal (collect, forEach, count...)
Faz tudo rodar de verdade e gera o resultado final.

• .toList()
Transforma o Stream de volta para uma lista.

• Método referência (String::toUpperCase)
É só um jeito curto de escrever um lambda simples.