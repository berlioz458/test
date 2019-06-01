import java.util.ArrayList;
import java.util.Iterator;
import java.util.List; // После появления в коде List класс сам импортнулся в класс

public class TestClass18 {
    public static void main(String[] args) {
        //18. Коллекция List

        int[] arrya = new int[3]; // что делать если мы не знаем размер заранее

        //интерфейсы для работы с коллекциями. одна из них это List
        //List - "динамический массив"
        //коллекция позволяет решить проблему статичного размера массива

        //создание
        // List <Объекты которые будут храниться - generic> Имя = new и указать тип листа
        // generic - (обобщения) параметризованные типы в Java
        // С их помощью можно объявлять классы, интерфейсы и методы
        // где тип данных указан в виде параметра
        List<Integer> list = new ArrayList<>();
        //метод add - добавление в список
        list.add(5);
        list.add(2);
        list.add(10);
        //при добавлении нового элемента размер увеличивается
        int a = list.get(2);
        System.out.println(list.get(0)); // get - получить элемент по индексу в List
        System.out.println(list.get(1));
        System.out.println(a);

        System.out.println();
        list.set(1, 16); // set - присвоение уже существующему нового значения
        System.out.println(list.get(1));

        list.remove(1); // remove - удаление элемента из списка
        System.out.println(list.get(1)); // важно: при удалении список смещается

        list.size(); // размер коллекции
        System.out.println(list.size());
        list.add(3);
        list.add(11);
        System.out.println(list.size());

        //полезное
        System.out.println();
        /*list.clear(); // очистить список
        System.out.println(list.size());*/

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        System.out.println(list.size());
        list.addAll(list2); // addAll - добавление всех элементов указанного списка
        System.out.println(list.size());

        System.out.println();
        list.removeAll(list2); // удаление элементов из списка которые содержаться в указанном
        System.out.println(list.size());

        System.out.println();
        /*list.isEmpty(); // пустой ли список?
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());*/

        System.out.println();
        list.contains(11); // узнать нахождение в списке указанного объекта
        System.out.println(list.contains(11));
        System.out.println(list.contains(555));

        System.out.println();
        list.addAll(list2);
        list.containsAll(list2); // проверить есть ли все элементы второго списка в первом
        System.out.println(list.containsAll(list2));
        list.removeAll(list2);
        System.out.println(list.containsAll(list2));

        System.out.println();
        //19. Итератор - работать с элементами списка (коллейкции)
        Iterator<Integer> iterator = list.iterator();
        //iterator.next();//указываем на первый элемент
        //System.out.println(iterator.next());
        //System.out.println(iterator.next());
        //hasNext - существует ли элемент в списке следующий
        //System.out.println(iterator.hasNext());

        // все значения списка на экран
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
