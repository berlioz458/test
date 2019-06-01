import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestClass20 {
    public static void main(String[] args) {
        // 20. Коллекция Set
        // так же как и List входит в коллекцию интерфейсов
        // но хранит только уникальные значения, в отличии от List

        Set<Integer> set = new HashSet<>(); // реализация HashSet
        set.add(10);
        set.add(11);
        //set.add(10);
        //set.add(11);
        //add добавление


        System.out.println(set.size());
        System.out.println();
        //set.get(); // нет такого метода, так нет индексов у Set


        //для вывода на экран используем уже знакомый итератора
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        // так используем при переборе
        //set.remove(11); // удаление не по индексу, а по значению
        for (int i : set){
            System.out.println(i);
        }

        System.out.println();

        //set.clear(); // очищение сета
        //System.out.println(set.size());

        System.out.println(set.contains(11)); // проверка на содержание элемента по значению

    }
}
