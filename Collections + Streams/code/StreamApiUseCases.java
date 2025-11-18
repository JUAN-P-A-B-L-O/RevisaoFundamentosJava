import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
    }


}
