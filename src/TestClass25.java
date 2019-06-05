public class TestClass25 {
    public static void main(String[] args) {
        //25. классы и объекты
        //класс - описание будущих объектов
        //на основе класса создаются экземляры класса - объекты, которые обладают всеми свойствами класса
        Car car1 = new Car(); // создали объект нашего класса
        car1.color = "Green";
        car1.lenght = 5000;
        car1.height = 2000;
        car1.width = 2000;

        car1.addWeight(50);
        car1.drive(120);

        car1.addWeight(700);
        car1.drive(100);

        Car car2 = new Car();
        car2.color = "White";
        Car car3 = new Car();
        car3.color = "Red";
        car2.drive(100);
        car3.drive(150);
    }
}
