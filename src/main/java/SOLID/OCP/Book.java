package SOLID.OCP;

public class Book {

    private final String name;
    private final String author;
    private final String text;

    public Book(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }
// łamie zasadę Single Responsibility Principle
   /* public String addPrefixToBookAuthor(String prefix) {
        return prefix;
    }*/
}
