abstract class game{
    abstract void play();
}
class Tenis extends game{
    public void play(){
        System.out.println("Tenis gamme ");
    }
}
class cricket extends game{
    public void play(){
        System.out.println("Cricket gamme ");
    }
}

public class Abstract {
    public static void main(String[] args) {
        cricket obj = new cricket();
        Tenis obj1 = new Tenis();
        obj.play();
        obj1.play();
    }


}
