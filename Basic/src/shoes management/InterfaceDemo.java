package Basic.src;

public class InterfaceDemo {
    public static void main(String[] args) {
        Shoes shoe =new Shoes(5000);
        System.out.println(shoe);

        shoe.applyDiscount(20);
        System.out.println("After apply discount"+shoe);
    }
}
