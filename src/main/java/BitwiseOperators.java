public class BitwiseOperators {
    public static void main(String[] args) {

        int d = 0b1010;// 10
        int e = 0b1100;
        System.out.println("d & e = " + (d & e)); // zwraca 8 bo 1010 & 1100 = 1000, porównuje bity i zwraca 1 jeśli oba bity są 1
        System.out.println("d | e: " + (d | e));    // zwraca 14 bo 1010 | 1100 = 1110, porównuje bity i zwraca 1 jeśli którykolwiek z bitów jest 1
        System.out.println("d ^ e: " + (d ^ e));    // zwraca 6 bo 1010 ^ 1100 = 0110, porównuje bity i zwraca 1 jeśli bity są różne
        System.out.println("~d: " + (~d));    // zwraca -11 bo ~1010 = 0101, zwraca wartość przeciwną
        System.out.println("d << 2: " + (d << 2));    // zwraca 40 bo 1010 << 2 = 101000, przesuwa bity w lewo o 2 miejsca
        System.out.println("e >> 1: " + (e >> 1)); // zwraca 6 bo 1100 >> 1 = 0110, przesuwa bity w prawo o 1 miejsce
        System.out.println("e >>> 1: " + (e >>> 1));// zwraca 6 bo 1100 >>> 1 = 0110, przesuwa bity w prawo o 1 miejsce
    }
}
