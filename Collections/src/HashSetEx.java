import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet <String> hashSet = new HashSet<>();
        HashSet <Integer> integerHashSet = new HashSet<>();
        hashSet.add("Mustafa");
        hashSet.add("Kazı");
        integerHashSet.add(10);
        integerHashSet.add(31);
        integerHashSet.add(2);
        integerHashSet.add(46);
        Iterator <Integer> integerIterator = integerHashSet.iterator();
        Iterator <String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
        // Sayıları ve karakterleri sıralar, Tüm bileşenler eşsiz olmadlıdır

    }
}
