public class Basictry {
    public static void main(String[] args) {
        arithmeticOP();
    }
    public static void arithmeticOP() {
        int a = 5;
        int b = 0;
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException  e){
            System.out.println(e.getMessage());
        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }
//        catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
        finally{
            System.out.println("I am finally Blocked");
        }
    }

}
