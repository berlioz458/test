public class TestClass28 {
    public static void main(String[] args) {
        //28. Урок, ООП Наследование
        // пример про котов и собак которые животные

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.name = "Barsic";
        dog.name = "Bobik";

        cat.color = "White";
        dog.color = "Black";

        cat.walk("park");
        dog.walk("balcon");

        cat.feed("fish");
        dog.sit();

        System.out.println();
        System.out.println("Cat name is " + cat.name);
        System.out.println("Dog name is " + dog.name);
    }
}
