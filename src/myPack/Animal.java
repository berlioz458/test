package myPack;

public class Animal {
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected String name;

    public void setColor(String color) {
        this.color = color;
    }

    protected String color;
    protected int var; // 29 урок

    public void walk(String place){
        System.out.println("We are walking here: " + place);
    }

    public void sleep(){
        System.out.println("Zzzzz");
        var = 3;
    }
}