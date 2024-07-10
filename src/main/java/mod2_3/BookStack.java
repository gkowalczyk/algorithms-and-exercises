package mod2_3;

import java.util.ArrayDeque;
import java.util.Deque;

public class BookStack {

    private final String title;
    private final String author;

    protected BookStack(String title, String author) {
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

    public static void main(String[] args) {
        BookStack book = new BookStack("title1", "author1");
        BookStack book1 = new BookStack("title2", "author2");
        Deque<BookStack> bookProcessorList = new ArrayDeque<>();
        bookProcessorList.push(book);
        bookProcessorList.push(book1);

        System.out.println("Stack size: " + bookProcessorList.size());

        bookProcessorList.pop();
        BookStack temp = bookProcessorList.pop();

        System.out.println("Stack size: " + bookProcessorList.size());

        System.out.println("last element: " + temp);

        System.out.println(book.equals(book1));



    }
}
