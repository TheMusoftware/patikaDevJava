import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Mustafa");
        queue.offer("kazı");
        System.out.println(queue.element());
        System.out.println();


        /*
        element() : Kuyruğun başındaki öğeyi verir, ama onu kuyruktan atmaz.


    add(eleman): Parametrede verilen elemanı kuyruğa ekler. İşlemin başarısız olması durumunda hata fırlatır.


    offer(eleman): Parametrede verilen elemanı kuyruğa ekler. İşlemin başarısız olması durumunda null döner.


    poll(): Kuyruğun başındaki elemanı kuyruktan çıkartır.


    peek(): Kuyrukta sıradaki elemana ulaşmak için kullanılır
         */
}
    }
