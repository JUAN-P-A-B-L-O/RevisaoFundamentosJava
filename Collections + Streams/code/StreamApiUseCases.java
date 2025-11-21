import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamApiUseCases {
    public static void main(String[] args) {
        String[] names = {
                "juan",
                "juan",
                "pablo",
                "pablo",
                "eugenio",
                "silva"
        };



        List<String> namesList = new ArrayList<>();


        for (String name: names ){
            namesList.add(name);
        }

        List<String> UpperCaseNamesArrayList =  namesList.stream()
                                                            .map(String::toUpperCase)
                                                            .collect(Collectors.toList());


        System.out.println(UpperCaseNamesArrayList);




        ///  avanced
        int[] numbers = {
                1,5,1,10,1,2
        };

        OptionalInt totalValue = Arrays.stream(numbers)
                .reduce( (int value, int value2) -> value + value2);

        if(totalValue.isPresent()){
            System.out.println(totalValue.getAsInt());
        }


        List<List<String>> listOfStringLists = List.of(List.of("juan", "Pedro", "Paulo"), List.of("Vanessa", "Karolinne"));

        System.out.println(listOfStringLists);

        List<String> listOfUpperCaseStringList = listOfStringLists.stream()
                .flatMap(List::stream)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(listOfUpperCaseStringList);


        Map<String, List<String>> mapGroupBy = namesList.stream()
                .collect(Collectors.groupingBy(String::toUpperCase));

        System.out.println("mapGroupBy: "  + mapGroupBy.toString());

    }


}
