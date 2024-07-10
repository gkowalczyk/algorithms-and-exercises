package mod2_3;

import java.util.LinkedList;
import java.util.List;

public class CollectionOfBook {


    private final String title;
    private final String author;

    protected CollectionOfBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}

class CollectionOfBookProcessor extends CollectionOfBook {

    protected CollectionOfBookProcessor(String title, String author) {
        super(title, author);
    }

    public static void main(String[] args) {
        CollectionOfBookProcessor book = new CollectionOfBookProcessor("title1", "author1");
        CollectionOfBookProcessor book1 = new CollectionOfBookProcessor("title1", "author1");
        List<CollectionOfBookProcessor> bookProcessorList = new LinkedList<>();
        bookProcessorList.add(book);
        bookProcessorList.add(book1);
        for (CollectionOfBookProcessor collection : bookProcessorList) {
            System.out.println(collection.getAuthor() + collection.getTitle());
        }
    }
}