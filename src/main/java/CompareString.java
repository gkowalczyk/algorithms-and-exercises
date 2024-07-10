public class CompareString {

    public static void main(String[] args) {
        String a= "a";
        String b= "b";
        String c= "b";
        String d= new String("b"); // nie znajduje się puli Stringów

        String inStringPool = a.intern();
        String inStringPool1 = b.intern();
        String inStringPool2 = c.intern();
        String inStringPool3 = d.intern();

        System.out.println(inStringPool == a);
        System.out.println(inStringPool1 == b);
        System.out.println(inStringPool2 == c);
        System.out.println(inStringPool3 == d);



        //true
        //true
        //true
        //false   nie znajduje się puli Stringów

        System.out.println(b.equals(c)); // porównanie wartości
        System.out.println(b == c); // porównanie adresów w pamięci

        System.out.println(b == d);
    }
}
