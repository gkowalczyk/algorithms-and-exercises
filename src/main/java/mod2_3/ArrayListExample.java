package mod2_3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> library = new ArrayList<>();
        library.add("50 Shades of Grey");
        library.add("Sherlock Holmes");
        library.add("The Last of the Mohicans");
        library.add("The Infinity");
        library.add("Better Call Saul");
        library.add("Journey to the Center of the Earth");
        library.add("Binary Death");
        library.add("Breaking Bad");
        library.add("Twenty Thousand Leagues Under the Sea");
        library.add("The Titanfall");
        library.add("Coma");
        library.add("Of Ants and Men");
        library.add("To Understand a Woman");
        library.add("Neverending Story");
        library.add("The Jungle Book");

        library.remove(library.size() - 1);
        library.add(14, "The Jungle Book");

        for (String book : library) {
            System.out.println(book);
        }
    }
}
