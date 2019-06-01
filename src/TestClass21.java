import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestClass21 {
    public static void main(String[] args) {
        //21. Коллекция Map
        //интерфейс которые не входит в коллекшн как set и list
        //хранит пару ключ и значение
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "black"); // вставка новой пары, ключ уникален
        map.put(2, "white");
        map.put(3, "yellow");

        map.get(1); // получение по ключу
        System.out.println(map.get(1));


        //System.out.println(map.size());
        //map.clear(); // очитска map
        System.out.println(map.size()); // size размер
        System.out.println();

        System.out.println(map.containsKey(90)); // есть ли ключ
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("white")); // есть ли значение
        System.out.println(map.containsValue("grey"));

        System.out.println();
        Set<Integer> set = map.keySet(); // получили ключи map
        Iterator<Integer> iterator = set.iterator(); // создали итератор на основе полученных ключей

        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next())); //итератором ходим по каждому ключу и забирая value отдаем его на вывод
        }

        map.put(3, "green"); //put так же может менять значение уже по существующему ключу.
        System.out.println(map.get(3));
        map.put(3, "none");
        System.out.println(map.get(3));


        System.out.println();
        Map<String, String> map2 = new HashMap<>();
        map2.put("Вася", "Vasya");
        map2.put("Вероника","Veronica");

        System.out.println(map2.get("Вася"));
    }
}
