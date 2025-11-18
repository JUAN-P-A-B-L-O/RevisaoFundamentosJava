import java.util.*;

public class CollectionsUseCase {


    public static void main(String[] args) {
        String[] names = {
                "juan",
                "juan",
                "pablo",
                "pablo",
                "eugenio",
                "silva"
        };

        List<String> clientArrayList = new ArrayList<>();
        List<String> clientLinkedList = new LinkedList<>();

        Set<String> clientHashSet = new HashSet<>();

        Map<String, Integer> clientHashMap = new HashMap<>();

        int index = 0;
        for (String name : names) {


            clientArrayList.add(name);
            clientLinkedList.add(name);

            clientHashSet.add(name);

            clientHashMap.put(name, index);

            index++;
        }



        System.out.println("I'm a array list: " + clientArrayList);

        System.out.println("I'm a linked list: " + clientLinkedList);
        System.out.println("I'm a hash set(it's like list but only unique values): " + clientHashSet);

        System.out.println("I'm a hash map(it's a dicionary with key-value struct (String - Integer)): " + clientHashSet);

    }
}
