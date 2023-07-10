import java.util.LinkedList;
import java.util.List;
public class LinkedListEx {
    public static void main(String[] args) {
        List <String> linkedList = new LinkedList<>();
        linkedList.add("Mustafa");
        linkedList.add(0,"Kazı");
        linkedList.add(1,"Software Engineering");

        for(String str : linkedList){
            System.out.println(str);
        }
    }
}
