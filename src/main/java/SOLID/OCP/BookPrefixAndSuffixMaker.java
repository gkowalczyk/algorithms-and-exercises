package SOLID.OCP;

public class BookPrefixAndSuffixMaker {

    private final BookAppenderPrefix bookAppenderPrefix;
    private final BookAppenderSufix bookAppenderSufix;

    public BookPrefixAndSuffixMaker(BookAppenderPrefix bookAppenderPrefix, BookAppenderSufix bookAppenderSufix) {
        this.bookAppenderPrefix = bookAppenderPrefix;
        this.bookAppenderSufix = bookAppenderSufix;
    }
    public String addPrefixAndSuffix(String prefix, String text, String suffix) {
        String authorAndPrefix = bookAppenderPrefix.addPrefixToBookAuthor(prefix, text);
        return bookAppenderSufix.addSuffixToBookAuthor(suffix, authorAndPrefix);
    }

    public static void main(String[] args) {
        BookAppenderSufix bookAppenderSufix = new BookAppenderSufix();
        BookAppenderPrefix bookAppenderPrefix = new BookAppenderPrefix();
        BookPrefixAndSuffixMaker bookPrefixAndSuffixMaker = new BookPrefixAndSuffixMaker(bookAppenderPrefix, bookAppenderSufix);
        System.out.println(bookPrefixAndSuffixMaker.addPrefixAndSuffix("prefix", "author", "suffix"));
    }
}


