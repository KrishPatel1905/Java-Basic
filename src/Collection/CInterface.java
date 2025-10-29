package Collection;
import java.util.*;



public class CInterface {
    public static void main(String[] args) {
        Collection<String> fr =new ArrayList<>();


        fr.add("Apple");
        fr.add("Banana");
        fr.add("Mango");
        
        System.out.println("The Fruites is "+fr);
        System.out.println(fr.size());
        fr.remove("Banana");

        System.out.println(fr);
        
    }
}
