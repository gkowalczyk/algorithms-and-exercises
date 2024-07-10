package mod2_3;

public class ClassObjectForArray {
    public static void main(String[] args) {

        int array[] = new int[3];
        byte byteArray[] = new byte[3];
        short shortsArray[] = new short[3];
        String[] stringsArray = new String[3];

        System.out.println(array.getClass());//class [I, wskazuja na tablice typu int
        System.out.println(array.getClass().getSuperclass());//class java.lang.Object, wskazuje na klase nadrzedna
        System.out.println(byteArray.getClass());
        System.out.println(stringsArray.getClass());
    }
}
