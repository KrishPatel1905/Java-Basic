interface Animal
{
    void eat();
    void sleep();
}
class Dog implements Animal
{
    public  void eat()
    {
        System.out.println("Dog eat");
    }
    public void sleep()
    {
        System.out.println("Dog sleep");
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Dog d = new Dog();
        d.eat();
        d.sleep();
        System.out.println("Hi Hello Everyone ");
    }
}
