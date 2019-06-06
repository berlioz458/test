public class TestClass22 {
    public static void main(String[] args) {
        // 22. Методы
        int a = 13;
        int b = 3;
        int sum;
        sum = getSum(a, b);
        System.out.println(sum);
        System.out.println(getSum(44, 22));
        showSum(10, 51, 77);
        showSum(5, 12, 14);
        saySomething();
        sayHello("Kate");
        String name = "Vova";
        sayHello(name);

        showSumToPerson(name,a,b,4);
    }

    //пример простого метода в котором складывается два значения
    static int getSum(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }

    // метод будет выводить сумму трех чисел на экран
    static void showSum(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println("Sum is: " + sum);
    }

    //без входных параметров
    static void saySomething(){
        System.out.println();
        System.out.println("Hello");
        System.out.println("I'm running");
        System.out.println("You see me");
    }

    static void sayHello(String name){
        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("I'm your program");
        System.out.println("Nice to meet you");
    }

    static void showSumToPerson(String name, int a, int b, int c){
        System.out.println("Start");
        sayHello(name);
        showSum(a,b,c);
        System.out.println("End");
    }

    //пример: таблица со строками. нам нужно получить значение из определенной ячейки по x и y, можем использовать как раз метод один для разных значений.
    //метод - это то что можно вынести, то что часто нужно использовать на разных данных.

    //static - так как main у нас static, не обязательно на самом деле.
    //модификаторы доступа дальше будут.
    //тип возращаемых данных - понятно

}
