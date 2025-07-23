
interface A  {
  
    int a=20;
  
    


}
interface B extends A {
    float b=12.5f;


}
interface C extends A {
    double c=12.5;


}
interface D extends B,C {
   long d =50L;

}
class E implements D {
    double total;
    public void cal(int a,float b,double c ,long d )
    {
    total =a*b*c*d;
   display();
    }
   public void display()
   {
    System.out.println("result : " +total);
   }
    
    
}

public class Interfacemethod2 {
    public static void main(String[] args) {
        E e= new E();
        e.cal(20,12.5f,12.5f,50L);
    }
}
