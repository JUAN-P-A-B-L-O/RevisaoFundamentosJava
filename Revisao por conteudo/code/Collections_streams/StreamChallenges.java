package Collections_streams;

import java.util.*;
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
        /// 10 -Agrupar palavras pela primeira letra
        /// .groupingBy(s -> s.substring(0,1))
        ///
        /// 11 -Agrupar números em PAR vs IMPAR
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
        List<String> names = Arrays.asList("Juan", "Paulo", "Gui", "Fernando", "Abel", "Pedro", "Fábio");
        List<Integer> numbers = Arrays.asList(2,4,2,5,6,5,7,10);

        // 1 exercise
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Exercise 1: " + upperCaseNames);

        // 2 exercise

        List<String> biggerThan5WordsNames = names.stream()
                .filter(name -> name.length()> 5 )
                .collect(Collectors.toList());

        System.out.println("biggerThan5WordsNames: " + biggerThan5WordsNames);

        // 3 exercise
        List<Integer> onlyPairNumbers = numbers.stream()
                .filter(number -> number % 2 ==0 )
                .collect(Collectors.toList());

        System.out.println("onlyPairNumbers: " + onlyPairNumbers);

        // 4 exercise

        Optional<Integer> totalReduced =  numbers.stream()
                .reduce( ( first,  second) -> first + second );

        if(totalReduced.isPresent()){
            System.out.println("totalReduced: " + totalReduced.get());
        }

        // 5 exercise
        Long countNumbers = numbers.stream()
                .count();

        System.out.println("countNumbers: " + countNumbers);

        // 6 exercise
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("distinctNumbers: " + distinctNumbers);




        // 7 Exercise

        Set<Integer> setNumbers = numbers.stream()
                .collect(Collectors.toSet());


        System.out.println("setNumbers: " + setNumbers);

        // 8 exercise

        List<String> sortedAlfabetNames = names.stream()
                .sorted((name1, name2) -> name1.compareTo(name2))
                .collect(Collectors.toList());

        System.out.println("sortedAlfabetNames: "+ sortedAlfabetNames);
        
        /// Nível 2 — Intermediário
        
        // 9 exercise
        Map<String, List<String>> dicUpperCaseNameToNames = names.stream()
                .collect(Collectors.toMap(String::toUpperCase, name -> Collections.singletonList(name)));

        System.out.println("dicUpperCaseNameToNames: " + dicUpperCaseNameToNames);


        // 10 exercise
        Map<Character, List<String>> dicByFirstLetter = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println("dicByFirstLetter: " + dicByFirstLetter);
    }
}
