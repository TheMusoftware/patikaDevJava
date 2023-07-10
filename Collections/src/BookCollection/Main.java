package BookCollection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Aslan Amca",250,"Abbas Ustaoğlu");
        Book book2 = new Book("Sofia",101,"Safiye Karahanlı");
        Book book3 = new Book("Çapsız Abidin",500,"Tuncay Kantarcı");
        Book book4 = new Book("Asiyenin hatası",65,"Ziya Yılmaz");
        Book book5 = new Book("P.A",902,"Efe Karahanlı");
        TreeSet<Book> books = new TreeSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        for(Book book: books){
            System.out.println(book.getName());
        }
        System.out.println("#######*********#######");
        TreeSet<Book> booksByNum = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPage()- o2.getPage();
            }
        });
        booksByNum.add(book1);
        booksByNum.add(book2);
        booksByNum.add(book3);
        booksByNum.add(book4);
        booksByNum.add(book5);
        for(Book book: booksByNum){
            System.out.println(book.getName());
        }
    }


}
