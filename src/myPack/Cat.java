package myPack;

public class Cat extends Animal {
    //класс myPack.Cat наследует свойства и методы класса myPack.Animal
    //при этом можем дополнить своими определенными методами и свойствами

    public void feed(String feed){
        System.out.println("I'm like: " + feed);
    }

    @Override // переопределение метода sound для класса котов
    public void sound(){
        System.out.println("mew mew mew");
    }
}
