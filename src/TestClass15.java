public class TestClass15 {
    public static void main(String[] args) {
        //15. Подробнее о типе "String"
        String s = "Hello World!"; // не примитивный тип. А целый класс.
        //ВАЖНО! Чтобы посмотреть на класс, нужно зажать Ctrl и нажать на объявление.
        //строка в итоге это объект.
        //1. Операция сравнения (не ==) так как сравниваются ссылки
        System.out.println(s.equals("Hello World!")); //equals - сравнение строки
        System.out.println(s.equals("Hello")); // булев ответ.

        String s2 = "Hello";
        System.out.println(s.equals(s2));

        s = "text";
        s2 = "TEXT";

        System.out.println(s.equals(s2)); // false - для сравнения без учета регистра нужно юзать equalsIgnorCase
        System.out.println(s.equalsIgnoreCase(s2));// true
        System.out.println();

        //2. Работа с регистром строк
        s = "TeXt";
        System.out.println(s);
        System.out.println(s.toLowerCase()); // берем нижний регистр
        System.out.println(s.toUpperCase()); // берем верхний регистр
        System.out.println();

        //3. Вычленение символов
        System.out.println(s.charAt(1)); //берем символ по индексу
        System.out.println(s.indexOf("e")); //обратная операция, можем найти индекс по куску строки.
        System.out.println();

        //4. Что внутри строки
        s = "Hello World";
        System.out.println(s.contains("Hello")); // есть ли указанная строка в нашей строке
        System.out.println(s.contains("blabla"));
        System.out.println();

        //5. Длинна строки
        System.out.println(s.length());
        System.out.println();

        //другие методы

        System.out.println(s.startsWith("H")); // startsWith - делает проверку начинается ли строка с заданной строки (регистор важен)
        System.out.println(s.startsWith("h"));
        System.out.println(s.endsWith("d")); // обратный метод endsWith - делает проверку заканчивается ли строка заданной строкой (регистр важен)
        System.out.println(s.endsWith("D"));

        System.out.println();

        s = "Hello,world,jopa,mamka,lalka";
        String[] array = s.split(","); //вроде как на основе строки s у нас создаться массив из слов, которые разделены определенным символом.
        System.out.println(array[0] + " " + array[1] + "!");
        System.out.println();

        //форматирование строк

        String str = "My name is %s. I'm %d years old"; //типо шаблон в который можем вляпать данные %s - строка, %d - число
        int age = 23;
        String name = "Kate";
        System.out.println(String.format(str,name,age)); // format - вроде как "Возвращает отформатированную строку, используя указанную локаль, форматную строку и аргументы."
        System.out.println(String.format(str,"Jopka", 70));
        System.out.println();

        //один метод из класса int перевод из строки в число
        String arg2 = "30";
        int V = Integer.parseInt(arg2); //вот такой вот перевод из строки в число
        System.out.println(V);
        System.out.println();

        s = "Hello world";
        System.out.println(s.substring(1, 5)); //берем часть строки от строки по индексам [1, 5]
        System.out.println(s.substring(7)); // часть строки от начала по индексу [7, и до конца)
        System.out.println(s.substring(0, s.length() - 3));
        System.out.println();

        //слияние строк конкатенация
        String str1 = "Привет";
        String str2 = "Мир!";

        String str3 = str1 + str2;
        System.out.println(str3);

        str3 = str1.concat(str2).concat(str2); //лучше по производительности
        System.out.println(str3);
    }
}
