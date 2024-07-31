import java.util.ArrayList;
import java.util.List;

public class StringStringBuilderStringBuffer {

//https://javastart.pl/baza-wiedzy/klasy/string-stringbuffer-i-stringbuilder
   //https://stormit.pl/stringbuilder/
   // https://1024kb.pl/nauka-java/jak-polaczyc-stringi-w-javie/

    public static void main(String[] args) throws InterruptedException {

List<String> list = List.of("Java", "Python", "C++", "JavaScript", "Ruby", "C#", "PHP", "Perl", "Go", "Swift");
List<String> mutableList = new ArrayList<>(list);
mutableList.replaceAll(e -> e.replace('a', 'm'));
        System.out.println(mutableList);

        //StringBuilder __>>>>>>>

        //Klasa StringBuilder powstała jako rozszerzenie funkcjonalności
        // oferowanych przez tradycyjnego stringa. W przeciwieństwie do
        // pierwowzoru StringBuilder jest klasą modyfikowalną, czyli jej
        // obiekty mogą się rozszerzać i zmieniać swoją zawartość. Dzięki
        // temu można łączyć ze sobą różne fragmenty tekstu, bez konieczności
        // generowania wielu niepotrzebnych obiektów.

        //Klasy te bazują na tablicy znaków, do której za każdy dodaniem nowego znaku
        // (append) jest dodawany znak. Dopiero na sam koniec operacji – podczas
        // wywołania toString() – jest tworzony obiekt String. Tak, tworzymy
        // tylko jeden raz obiekt String, dlatego to wszystko wykonuje się dużo szybciej.

StringBuilder stringBuilder = new StringBuilder(); // tworzymy pusty bufor
stringBuilder.append("java").append("rocks"); // modyfikacja bufora poprzez metode append4
String value = stringBuilder.toString();
        System.out.println("value:" + value);

stringBuilder.insert(4, 8); //metoda insert
        System.out.println("stringbuilder:" + stringBuilder);

        stringBuilder.replace(0, 6, "Java7"); //metoda replace
        System.out.println("stringbuilder:" + stringBuilder);

        stringBuilder.delete(4, 5); //metoda delete
        System.out.println("stringbuilder:" + stringBuilder);

        stringBuilder.reverse(); //metoda reverse
        System.out.println("stringbuilder:" + stringBuilder);

         //metoda  int capacity, rozmiar bufora
        System.out.println("stringbuilder:" + stringBuilder.capacity());

        stringBuilder.ensureCapacity(20);
        System.out.println("stringbuilder:" + stringBuilder.capacity());

        // int lenght - zwraca aktualny rozmiar ciągu
        System.out.println("stringbuilder:" + stringBuilder.length());

        // charAt  - znak pod danym indeksem
        System.out.println("stringbuilder:" + stringBuilder.charAt(1));

        // substring  - zwraca danym ciąg znaków w zakresie int start oraz int end
        System.out.println("stringbuilder:" + stringBuilder.substring(0,3));

///////////////////////////////////////////////////////////////////////////////////


        String s1 = "Kasia";
        s1 = s1 + " i Tomek";

        System.out.println(s1);
        //do javy 8 :



        String s = "Kasia";
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) { // nieefektywna metoda tworzenie 10tyś obiektów StringBuilder  i metod
            s = s + "a";  // za każdym razem tworzony jest nowy obiekt , będący kopią

            //      String jest immutable – po dodaniu nowego Stringa (po zmianie stanu obiektu) – została zwrócona
            //      jego kopia, czyli obiekt z nowym adresem.
            //String blog = "1024kb";
            //System.out.println("Adres String przed dodaniem: " + Integer.toHexString(blog.hashCode()));
            //blog += ".pl";
            //System.out.println("Adres String po dodaniu nowego Stringa: " + Integer.toHexString(blog.hashCode()));

        }

        System.out.println("Time1:" + (System.nanoTime() - start + "ns"));


        //efektywniej ->>>

        //Klasy te bazują na tablicy znaków, do której za każdy dodaniem nowego
        // znaku (append) jest dodawany znak. Dopiero na sam koniec operacji –
        // podczas wywołania toString() – jest tworzony obiekt String. Tak,
        // tworzymy tylko jeden
        // raz obiekt String, dlatego to wszystko wykonuje się dużo szybciej.
       // String s = "Kasia";
        s = new StringBuilder(s).append(" i Tomek").toString(); //nowy obiekt StringBuilder
        System.out.println(s);

        long start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder(s);//tworzymy obiekt przed pętlą
        for (int i = 0; i < 1000; i++) {
            sb.append("a"); // po każdym dodaniu znaku do obiektu StringBuilder
        }
        s = sb.toString();
        System.out.println("Time2:" + (System.nanoTime() - start1 + "ns"));

    // od java 9 : za pomocą mechanizmu invokedynamic w locie łączone są Stringi
        String s2 = "Kasia";
        s2 = s2 + " i Tomek";

        System.out.println("s2:" + s2);

//StringBuffer - klasa synchronizowana,  StrinBuilder - nie jest synchronizowana



StringBuffer stringBuffer = new StringBuffer();

new Thread(() -> {
    for (int i = 0; i < 100_000; i++) {
        stringBuffer.append("a");
    }}).start();

        for (int i = 0; i < 100_000; i++) {
            stringBuffer.append("b");
        }

        Thread.sleep(1000);

        String result = stringBuffer.toString();
        System.out.println(result.length());

//Niestety ze względu na to, że StringBuilder nie jest przystosowany do
// pracy w wielu wątkach program ten często się wywala
// (błędy typu ArrayIndexOutOfBoundsException w środku w StringBuilderze),
// a jeśli już się udało, to otrzymywałem
// wyniki rzędu 120 tys. Wychodzi na to, że 80 tys. znaków przepadło!


//Jeszcze raz, najważniejsze różnice:
//String jest immutable, StringBuilder i StringBuffer – mutable (bufor)
//String przechowywany jest w String Pool, StringBuilder i StringBuffer – w normalnej stercie
//StringBuilder i StringBuffer są znacznie wydajniejsze do celów modyfikacji sekwencji znaków


        //Sprawdzenie niezmienności obiektów String
        String sachin = "Sachin";
        String sachin1 = new String("Sachin1");


        // concat() method appends
        // the string at the end
        sachin.concat(" Tendulkar");
        sachin1.concat(" Tendulkar");//z
        sachin1 = "Sachin2";// nowy obiekt // zwróci "Sachin2"
        sachin1 =  sachin1.concat(" Tendulkar"); //zwróci "Sachin2 Tendulkar"


        // This will print Sachin
        // because strings are
        // immutable objects
        System.out.println(sachin);
        System.out.println("\n");

        System.out.println(sachin1);
        System.out.println("\n");

        StringBuffer stringBuffer1 = new StringBuffer("stringBuffer");
        System.out.println(stringBuffer1.append("stringbuffer")); // występuje mutowalność, więc można zmodyfikować obiekt bez tworzenia nowego



// Internowanie Stringów

        String demoString = new String("Geeks"); // utworzenie Stringa w sposób dynamiczny oznacza że nie jest on przechowywany w puli Stringów
        String internString = demoString.intern();//intern() - metoda zwraca referencję do obiektu String, który jest przechowywany w puli Stringów
        System.out.println(internString == demoString); //false
        System.out.println(internString.equals(demoString)); //true
        System.out.println(internString);

        //kolejny przykład

        byte ascii[] = { 71, 70, 71 };

        String firstString = new String(ascii);
        System.out.println(firstString);

        String secondString = new String(ascii, 1, 2);
        System.out.println(secondString);

        //Inne motody z klasy String


        String string= "GeeksforGeeks";
        // or String s= new String ("GeeksforGeeks");

        // Returns the number of characters in the String.
        System.out.println("String length = " + string.length());

        // Returns the character at ith index.
        System.out.println("Character at 3rd position = "
                + string.charAt(3));

        // Return the substring from the ith  index character
        // to end of string
        System.out.println("Substring " + string.substring(3));

        // Returns the substring from i to j-1 index.
        System.out.println("Substring  = " + string.substring(2,5));

        // Concatenates string2 to the end of string1.
        String string1 = "Geeks";
        String string2 = "forGeeks";
        System.out.println("Concatenated string  = " +
                string1.concat(string2));

        // Returns the index within the string
        // of the first occurrence of the specified string.
        String s4 = "Learn Share Learn";
        System.out.println("Index of Share " +
                s4.indexOf("Share"));

        // Returns the index within the string of the
        // first occurrence of the specified string,
        // starting at the specified index.
        System.out.println("Index of a  = " +
                s4.indexOf('a',3));

        // Checking equality of Strings
        Boolean out = "Geeks".equals("geeks");
        System.out.println("Checking Equality  " + out);
        out = "Geeks".equals("Geeks");
        System.out.println("Checking Equality  " + out);

        out = "Geeks".equalsIgnoreCase("gEeks ");// equalsIgnoreCase porównuje stringi ignorując
        System.out.println("Checking Equality " + out);

        //If ASCII difference is zero then the two strings are similar
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+out1);
        // Converting cases
        String word1 = "GeeKyMe";
        System.out.println("Changing to lower Case " +
                word1.toLowerCase());

        // Converting cases
        String word2 = "GeekyME";
        System.out.println("Changing to UPPER Case " +
                word2.toUpperCase());

        // Trimming the word
        String word4 = " Learn Share Learn ";
        System.out.println("Trim the word " + word4.trim());

        // Replacing characters
        String str1 = "feeksforfeeks";
        System.out.println("Original String " + str1);
        String str2 = "feeksforfeeks".replace('f' ,'g') ;
        System.out.println("Replaced f with g -> " + str2);


    }
}