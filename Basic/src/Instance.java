 class My{

    {

        System.out.println("How Are you");
    }
    static {
        System.out.println("Hi I am Krish");
    }
    My()
    {
        System.out.println("Hello");
    }
}
public class Instance {
   public static void main(String [] args)
   {
     My m=new My();
       System.out.println(m);
   }
}
