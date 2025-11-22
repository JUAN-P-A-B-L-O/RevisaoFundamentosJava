import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamChallenges {
        /// 🟦 Nível 1 — Básico (Aquecimento)
        ///
        /// 1 -Converter tudo para maiúsculas
        /// List<String> → List<String>
        ///
        /// 2 - Filtrar nomes com mais de 5 letras
        ///
        /// 3- Pegar apenas números pares
        /// List<Integer>
        ///
        /// 4 -Somar todos os números usando .reduce
        ///
        /// 5 -Contar quantos elementos existem usando .count()
        ///
        /// 6 -Remover duplicados com .distinct()
        ///
        /// 7 - Transformar lista em um Set usando .collect(Collectors.toSet())
        ///
        /// 8 - Ordenar alfabeticamente usando .sorted()
        ///
        /// 🟩 Nível 2 — Intermediário
        ///
        /// 9 - Criar um Map onde a chave é o nome em maiúsculo e o valor é o original
        /// .collect(Collectors.toMap(...))
        ///
        /// Agrupar palavras pela primeira letra
        /// .groupingBy(s -> s.substring(0,1))
        ///
        /// Agrupar números em PAR vs IMPAR
        ///
        /// Criar um Map<String, Long> contando quantas vezes cada palavra aparece
        /// .groupingBy(..., counting())
        ///
        /// Pegar o maior número da lista com .max()
        ///
        /// Pegar o menor número com .min()
        ///
        /// Transformar List<Person> → Map<Integer, List<Person>> agrupando por idade
        ///
        /// Concatenar todos os nomes em uma única String com Collectors.joining(", ")
        ///
        /// 🟥 Nível 3 — Avançado
        ///
        /// Criar uma lista somente com nomes únicos ignorando acentos
        /// (usar Normalizer + distinct)
        ///
        /// Filtrar objetos onde algum campo é null
        /// .filter(Objects::nonNull)
        ///
        /// Ordenar objetos por múltiplos campos
        /// .sorted(comparing(Person::getAge).thenComparing(Person::getName))
        ///
        /// Criar uma pipeline completa:
        /// filtrar → mapear → ordenar → reduzir
        ///
        ///
    public static void main(String[] args) {
        // 1 exercises
        List<String> names = Arrays.asList("juan", "paulo", "gui", "fernando");


        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Exercise 1: " + upperCaseNames);

        // 2 exercises



    }
}
