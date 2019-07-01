import myPack.Cats;
import myPack.Dogs;

public class TestClass31 {
    public static void main(String[] args) {
        //Урок 31. Абстрактные классы.
        //

        Dogs dog = new Dogs();
        Cats cat = new Cats();

        dog.walk("Park");
        dog.sayWord();

        cat.walk("home");
        cat.eat();
    }
}
