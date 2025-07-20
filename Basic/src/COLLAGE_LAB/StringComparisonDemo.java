package COLLAGE_LAB;

public class StringComparisonDemo {
    public static void main(String[] args) {
        String str1="Java";
        String str2="Java";
        String str3 =new String("Java");

        System.out.println("Using == opreation");
        System.out.println("str1==str2"+(str1==str2));
        System.out.println("str1==str3"+(str1 == str3));//laction base

        System.out.println("\n Using eqauls method ");
        System.out.println("str1.equals(str2)"+str1.equals(str2));
        System.out.println("str1.equals(str3)"+str1.equals(str3));//string base


        String a="Java";
        String b="Ja " + "va";
        String c="Ja";
        String d=(c+"va"+"PI").intern();
        String e="javaPI".intern();

        System.out.println("a==b "+(a == b));
        System.out.println("a==c " +(a == c));
        System.out.println("a==d " +(a == d ));
        System.out.println("a==d " +(a == e));
        System.out.println("a.equlas(b) " +a.equals(b));
        System.out.println("a.equlas(d) " +a.equals(d));
        System.out.println("a.equlas(e) " +a.equals(e));
    }
}
//Regex patten matches /capacity ensucpacity in buffer