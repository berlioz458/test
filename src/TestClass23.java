public class TestClass23 {
    public static void main(String[] args) {
        //23. Перегрузка методов
        int res1 = getSum(2, 4);
        int res2 = getSum(4, 2, 6);
        System.out.println(res1 + " and " + res2);
        System.out.println();

        sayHello("Tolya");
        sayHello("Katya", "Dima");
        sayHello();

        System.out.println("-------------------");
        int[] array = {1,3,7,3,5,100};
        int s = getSum(array, "Kate");
    }

    static int getSum(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }

    static int getSum(int x, int y, int z) { // перегрузили метод, у него имя такое же но параметров больше
        int sum;
        sum = x + y + z;
        return sum;
    }

    static int getSum(int[] array, String name) { // перегрузили метод, у него имя такое же но массив передается
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }

        System.out.println("Hi " + name);
        System.out.println("Sum = " + sum);
        return sum;
    }

    static void sayHello(String name) {
        System.out.println();
        System.out.println("Hello " + name + "!");
        System.out.println("I'm your program");
        System.out.println("Nice to meet you");
    }

    static void sayHello(String name1, String name2) {
        System.out.println();
        System.out.println("Hello " + name1 + "!");
        System.out.println("Hello " + name2 + "!");
        System.out.println("I'm your program");
        System.out.println("Nice to meet you");
    }

    static void sayHello() {
        System.out.println();
        System.out.println("Hello !");
        System.out.println("I'm your program");
        System.out.println("Nice to meet you");
    }



}
