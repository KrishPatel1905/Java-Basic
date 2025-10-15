package BASIC;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Krish");
        sb.append("Patel");
        sb.insert(0, "HI");
        sb.replace(3, 7, "Hello");
        // sb.reverse();

       System.out.println(sb);
    }
}
