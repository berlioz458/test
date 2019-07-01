package myPack;

public class Dogs extends Animals{
    @Override
    public void sayWord() {
        System.out.println("Gav Gav Gav");
    }

    @Override
    public void eat() {
        System.out.println("I like kaki");
    }

    public void sit(){
        System.out.println("i'm sitting");
    }
}
