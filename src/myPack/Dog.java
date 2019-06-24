package myPack;

import myPack.Animal;

public class Dog extends Animal {
    private int weight = 2;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // класс myPack.Dog наследует свойства и методы класса myPack.Animal
    //при этом можем дополнить своими определенными методами и свойствами


    public void sit(){
        System.out.println("I'm sitting");
    }

    public void lay(){
        System.out.println("I'm laying");
    }
}
