public class TestClass24 {
    public static void main(String[] args) {
        //24. Исключения
        //ошибка возникающая во время работы программы
        //научимся обрабатывать такие ошибки
        dev(10, 2);
        try {
            dev(10, 2);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }

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
    public static void dev(int x, int y) throws ArithmeticException{ //указываем что метод можешь выкинуть исключение
        if (y == 0){ //прописываем ситуацию на которую бросать исключение
            throw new ArithmeticException("Cannot dev by zero!");
        } else {
            System.out.println("Dev = " + x / y); //будет тренироваться на делении на 0
        }

    }
}
