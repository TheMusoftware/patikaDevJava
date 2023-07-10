import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap <String,String> countries = new HashMap<>();
        countries.put("USA","United States Of America");
        countries.put("DE","Germany");
        countries.put("GB","United Kingdom");
        countries.put("TR","Turkey");

        for(String keys: countries.keySet()){
            System.out.println(countries.get(keys));
        }
        System.out.println("###############");
        //LinkedHashMaps --- verilen sıra korunur
        LinkedHashMap <Integer,String> students = new LinkedHashMap<>();
        students.put(10,"Mustafa");
        students.put(27,"Ömer");
        students.put(300,"Ziya");
        students.put(1,"Mehmet");
        for(int key : students.keySet()){
            System.out.println(students.get(key));
        }

    }
}
