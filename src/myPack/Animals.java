package myPack;

public abstract class Animals {
    public abstract void sayWord(); //объявили метод, но не реализовали, он будет в классе обычном
    public abstract void eat();

    public void walk(String place){
        System.out.println("I'm walking on the " + place);
    }
}
