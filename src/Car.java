public class Car {
    //класс для урока 25

    final static int var = 20; // статичная переменная класса, для урока 27, UPD: при указании модификатора final значение переменной нельзя изменить, только получить.
    static void method(){ // если поставить final то его нельзя переопределить, далее будет разжевано.
        System.out.println("Static method");
    }

    public Car(){ // это вот конструктор, выполняется при создании объекта класса
        System.out.println("New car created");
    }

    public Car (String color){
        this.color = color;
    }

    public Car (String color, int height, int width, int lenght){
        this.color = color;
        this.height = height;
        this.width = width;
        this.lenght = lenght;
    }

    //указали характеристики
    int height;
    int width;
    int lenght;
    int weight = 2000;
    int maxWeight = 2700;
    String color;
    int speed;
    int maxSpeed = 260;

    //указали методы
    public void addWeight(int weight) {
        this.weight += weight; // к текущей добавляем еще массу
        System.out.println("New weight = " + this.weight);
    }

    public void drive(int speed){
        if(weight <= maxWeight){
            this.speed = speed; // установили скорость и типо едем
            System.out.println("We are driving");
        } else {
            System.out.println("cannot drive!");
        }
    }
}
