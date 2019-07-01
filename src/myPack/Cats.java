package myPack;

public class Cats extends Animals{
    @Override
    public void sayWord() {
        System.out.println("mew mew mew");
    }

    @Override
    public void eat() {
        System.out.println("i like milk");
    }
}
