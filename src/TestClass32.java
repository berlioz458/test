import myPack.Plane;
import myPack.Car;
public class TestClass32 {
    public static void main(String[] args) {
        //32. Урок про интерфейсы
        //тут указываем описание методов без их тела.

        Plane plane = new Plane();
        Car car = new Car();

        plane.go();
        plane.stop();
        plane.setSpeed(30);

        car.go();
        car.stop();
        car.method1();
        car.method2();
        car.method3();

    }
}
