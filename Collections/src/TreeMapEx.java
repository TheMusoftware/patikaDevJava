import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap <Integer, String> notes =  new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        notes.put(28,"Orhan");
        notes.put(100,"Aslan");
        notes.put(80,"Nursen");
        for(String students : notes.values()){
            System.out.println(students);
        }
    }
}
