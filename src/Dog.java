public class Dog extends Animal{
    // класс Dog наследует свойства и методы класса Animal
    //при этом можем дополнить своими определенными методами и свойствами
    String weight;

    public void sit(){
        System.out.println("I'm sitting");
    }

    public void lay(){
        System.out.println("I'm laying");
    }
}
