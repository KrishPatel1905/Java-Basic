package ClassWork;

import java.util.Scanner;

interface Gas{
    public int x=5;
    public int GasCalculate(int x);



}
class g95 implements Gas{
    public int GasCalculate(int x){
        int cal;
        cal=x*95;
        System.out.println("Calculated Gas is "+cal);
    }
}
class g98 implements Gas{
    public int GasCalculate(int x){
        int cal;
        cal=x*98;
        System.out.println("Calculated Gas is "+cal);
    }
}
class gd implements Gas{
    public int GasCalculate(int x){
        int cal;
        cal=x*100;
        System.out.println("Calculated Gas is "+cal);
    }
}

public class Gasmeter {

//    Scanner sc = new Scanner(System.in);

//    static int GasCalculate(float x){
//        return x;
//    }
    public static void main(String[] args) {
//        System.out.println(+);
        int x=25;
        gd gd = new gd(x);

        g98 g98 = new g98();
        g98.GasCalculate(x);
        g95 g95 = new g95();
        g95.GasCalculate(x);
    }
}
