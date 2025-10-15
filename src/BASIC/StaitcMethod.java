package BASIC;
public class  Demo{
    static int a = 5;
    static void chnage()
    {
        a=6;
        System.out.println("The Value of A :"+a);
    }

    
}

public class StaitcMethod {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.chnage();
    }
    
}
