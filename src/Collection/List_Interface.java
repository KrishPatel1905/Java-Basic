import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>();
        names.add("Krish");
        names.add("Rahul");
        names.add("Priya");
        names.add("Krish"); 

        System.out.println("ArrayList: " + names);

        List<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); 

        System.out.println("LinkedList: " + numbers);

        
        System.out.println("First name:: " + names.get(0));

        
        names.remove("Rahul");
        System.out.println("After removing Rahul: " + names);
    }
}
