package Basic.Normal;

import java.util.Scanner;
class outer{
     private int b;
     class inner{
         private int a;
         inner()
         {


             System.out.println("Hello i am inner ");
         }
     }
}

public class temp {
     public static void main(String[] args)
     {
              outer ot=new outer();
              outer.inner in= ot.new inner();
                 ot.b=10;
                 in.a=5;
          System.out.println(ot.b);
         System.out.println(in.a);
     }
}
