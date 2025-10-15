package BASIC;

 interface Try {
static void t(){
    System.out.println("I am  Try Method");
}
 }
  
 class Test implements Try {
       public void t() {
        System.out.println(" i am overide method");
      };
    
}



public class Demo {
    public static void main(String[] args) {
        Try x = new Test();
    x.t();
        
    }
    
    
}
