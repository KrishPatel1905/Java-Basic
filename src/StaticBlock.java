class ty{
    static int x=5;
    static {
        System.out.println("The Value of x :"+x);
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("StaticBlock Called ");
        //also access in main
        System.out.println("Val Of X :"+ty.x);
    }
}
    