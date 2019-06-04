public class TestClass24 {
    public static void main(String[] args) {
        //24. Исключения
        //ошибка возникающая во время работы программы
        //научимся обрабатывать такие ошибки
        dev(10, 2);
        dev(10, 0);
    }

    /*public static void dev (int x, int y)
    {
        try { // что нужно сделать
            System.out.println("Dev = " + x/y); //будет тренироваться на делении на 0
            // есть спец конструкция для ловли таких исключений
        }catch (ArithmeticException e){
            System.out.println("Problem");// если поймали что делать
            //e.printStackTrace();
        }
        finally { // выполняется в любом случае
            System.out.println("Finaly");
        }
    }*/

    //другой вариант ловли
    public static void dev(int x, int y) {
        System.out.println("Dev = " + x / y); //будет тренироваться на делении на 0
    }
}
