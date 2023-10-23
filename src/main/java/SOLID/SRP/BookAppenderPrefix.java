package SOLID.SRP;

public class BookAppenderPrefix {

    public String addPrefixToBookAuthor(String prefix, String book) {
        return prefix + book;
    }

    public static void main(String[] args) {
        BookAppenderPrefix bookAppenderPrefix = new BookAppenderPrefix();
        Book book = new Book("name", "author", "text");
        System.out.println(bookAppenderPrefix.addPrefixToBookAuthor("prefix", book.getAuthor()));
    }
}
