public class TestClass16 {
    public static void main(String[] args) {
        //16. Условия и множенственный выбор
        int i = 10; // 20, 7, 10

        System.out.println("Start of program");
        if (i > 10){ //условие ЕСЛИ
            System.out.println("i > 10");
            i++;
            System.out.println(i);
        }
        else if(i < 10 && i > 5){
            System.out.println("i < 10 && i > 5");
            i--;
            System.out.println(i);
        }
        else {
            System.out.println("nothing");
        }



        System.out.println("End of program");

        System.out.println();
        i = 90;

        if (i > 50){
            System.out.println("i > 50");
            if (i > 90){
                System.out.println("i > 90");
            }else {
                System.out.println("i <= 90");
            }
        }else {
            System.out.println("i <= 50");
        }


        System.out.println();
        i = 10;
        switch (i){ //аналог IF, действия срабатывают при условии
            case 1:
                System.out.println("That number is 1");
                break;
            case 2:
                System.out.println("That number is 2");
                break;
            case 3:
                System.out.println("That number is 3");
                break;
            default: //типа else необязательный оператор
                System.out.println("I don't know the number");
        }

    }
}
