import myPack.Cat;
import myPack.Dog;

public class TestClass28 {
    public static void main(String[] args) {
        //28. Урок, ООП Наследование
        // пример про котов и собак которые животные

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.setName("Barsic");
        dog.setName("Bobik");

        cat.setColor("White");
        dog.setColor("Black");


        cat.walk("park");
        dog.walk("balcon");

        cat.feed("fish");
        dog.sit();

        System.out.println();
        System.out.println("myPack.Cat name is " + cat.getName());
        System.out.println("myPack.Dog name is " + dog.getName());
        System.out.println("\n\n\n");

        System.out.println(dog.getWeight());
        dog.setWeight(15);
        System.out.println(dog.getWeight());
    }
}
