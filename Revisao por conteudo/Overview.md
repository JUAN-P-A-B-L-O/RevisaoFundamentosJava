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

    link for more info: https://www.geeksforgeeks.org/java/stream-in-java/

flatMap() V/s map()

map() transforms each element of a stream into another object, resulting in a stream of the same size as the input. It's used for one-to-one transformations.
flatMap() transforms each element of a stream into zero or more elements, potentially changing the size of the stream. It's used for one-to-many transformations and flattening nested structures. (Para estruturas aninhadas - tipo o nested no elastic)

groupingBy - Agrupa em um map elementos da lista q satisfazem a função passada