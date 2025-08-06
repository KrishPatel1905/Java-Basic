package CAL;
@FunctionalInterface
interface Calculator {
    int oprate(int a, int b);
}
//class Add implements Calculator {
//    @Override
//    public int oprate(int a, int b) {
//        return a + b;
//    }
//}
//class mul implements Calculator {
//    public int oprate(int a,int b)
//    {
//        return a * b;
//    }
//}

public class FunctionDemo {
    public static void main(String[] args) {
////        Calculator add =new Add();
//        add.oprate(5,5);
//        System.out.println(add.oprate(5,5));
//        Calculator mul =new mul();
//        mul.oprate(5,5);
//        System.out.println(mul.oprate(5,5));
//
//        Calculator add = new Calculator() {
//            @Override
//            public int oprate(int a, int b) {
//                return a+b;
//            }
//        };
//        Calculator multiply = new Calculator() {
//            @Override
//            public int oprate(int a, int b) {
//                return a*b;
//            }
//        };
        Calculator add = (a, b) -> a + b;
        System.out.println(add.oprate(10, 20));

        Calculator mul = (a, b) -> a * b;
        System.out.println(mul.oprate(10, 20));


    }
}
