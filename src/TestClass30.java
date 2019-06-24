import myPack.Cat;
import myPack.Dog;

public class TestClass30 {

    //30 урок ооп полиморфизм - один объект разная реализация.
//    полиморфизм — это способность обьекта использовать методы производного класса, который не существует на момент создания базового.


    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
    }
}
