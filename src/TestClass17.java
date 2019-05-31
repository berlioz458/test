public class TestClass17 {
    public static void main(String[] args) {
        // 17. Циклы
        // если мы хотим что-то повторить несколько раз (возможно бесконечно)
        // цикл for

        System.out.println("Start program");

        for (int i = 0; i < 10; i++) //оператор (создание счетчика; условие выполнения цикла; работа счетчика)
        {
            System.out.println(i * 10);
        }

        System.out.println("End program");

        System.out.println();
        for (int j =  10; j > 0; j--)
        {
            System.out.println(j);
        }
        System.out.println();

        //заполнение массива
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
        {
            array[i] = i * 2;
        }

        // вывод заполненного массива
        for (int i = 0;i < 10; i++)
        {
            System.out.println("Element with index [" + i + "] is: " + array[i]);
        }

        System.out.println();

        //forEach - подобие цикла for
        for (int element : array) //перебор, создали переменную и ею перешли по кажждому элементу массива
        {
            System.out.println(element);
        }

        //while - еще один вариант цикла, подходит для бесконечных циклов

        System.out.println();
        int i = 0;
        boolean bool = true;
        while (i < 10) //цикл срабатывает пока работает условие
        {
            System.out.println("While: " + i);
            i++;
        }
        System.out.println();
        i = 0;
        while (bool) // проверка а потом действия
        {
            System.out.println("While: " + i);
            i++;
            if (i == 5) bool = false;
        }

        // do while
        System.out.println();
        i = 0;
        do{ // действия а потом проверка
            System.out.println("Do:" + i);
            i++;
        } while (i < 5);
    }
}
