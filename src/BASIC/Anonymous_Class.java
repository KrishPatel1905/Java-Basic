package BASIC;

import java.lang.annotation.AnnotationFormatError;
interface Animal {
    void show();
}
public class Anonymous_Class {  
    public static void main(String[] args) {
        Animal a = new Animal() {
               public void show()
               {
                System.out.println("Hey  i am anonymous class ....");
               }
            
        };
        
        a.show();
    }
    
}
