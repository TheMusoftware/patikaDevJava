import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(21);
        linkedHashSet.add(1);
        linkedHashSet.add(7);
        linkedHashSet.add(99);
        linkedHashSet.add(7);
        Iterator <Integer> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // Sıralama olmaz tüm bileşenelr unique olmalıdır
    }
}
