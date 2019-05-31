public class TestClass14 {
    public static void main(String[] args) {
        //основные операции
        //1. присваивание
        int a;
        a = 10; //присваивание "="
        a = 20;
        System.out.println(a);

        int b = a;
        System.out.println(b);
        int c,d;
        c = d = b;
        System.out.println(c + " " + d);

        //арифметика
        a = 13;
        b = 5;
        System.out.println();
        System.out.println(a+b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        double e = 15;
        double f = 7;
        System.out.println(e % f); //остаток от деления

        a = (b + c) * d;
        System.out.println(a); //приоритеты совпадают как и в обычной математике
        a = 15;
        b = 10;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a - 5 >= b);
        System.out.println(a == b); //сравнение на равенство
        System.out.println(a != b);
        System.out.println(a + 10 <= b + 15);
        System.out.println(!(a + 10 <= b + 15));// ! - операция отрицания
        System.out.println(!false);

        System.out.println();
        //инкремент и дикремент
        int i = 0;
        i++; // i = i + 1
        System.out.println(i);
        i--; // i = i - 1;
        System.out.println(i);

        System.out.println(i++); // вывод до операции, с учетом того что операция вывода выше видимо
        System.out.println(i);

        i = 3;
        a = i++; //прибавление после присваивания
        System.out.println(a);

        i = 3;
        a = ++i; //прибавление до присваивания
        System.out.println(a);

        //булевы операции
        a = 10;
        b = 20;

        System.out.println(a > b || a < b); // || - ИЛИ
        System.out.println(a > b || b > 30);

        //тестовый пуш
        //еще один тестовый коммент, как мне его забрать из репы правильно ?

    }
}
