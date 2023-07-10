package BookCollection;

public class Book implements Comparable <Book>{

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.getName());
    }
    String name;
    int page;
    String author;

    public Book(String name, int page, String author) {
        this.name = name;
        this.page = page;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getPage() {
        return page;
    }

    public String getAuthor() {
        return author;
    }
}
