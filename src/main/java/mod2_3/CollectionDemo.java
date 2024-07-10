package mod2_3;

import java.util.*;

public class CollectionDemo {  // brak wspólnego interfejsu dla klas Vector i Hashtable
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4};
        Vector<Integer> v = new Vector<>();
        Hashtable<Integer, String> h = new Hashtable<>();

        v.addElement(1);
        v.addElement(2);

        h.put(1, "Geeks");
        h.put(2, "4");

        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));
//------------------------------------------

        Iterable k; // udostępnia iterator do kolekcji, jest implementowanty przez List, Set, Queue, Deque, Map, SortedSet, SortedMap, NavigableSet, NavigableMap itd..

        //----------------------------------------------------------------------------------------------------------------------------------------------------------------

        Collection collection; // udostępnia metody do zarządzania kolekcją, jest implementowany przez List, Set, Queue, Deque, Map, SortedSet, SortedMap, NavigableSet, NavigableMap itd..Dlatego w skrócie możemy powiedzieć, że ten interfejs buduje fundament, na którym implementowane są klasy kolekcji.

        //----------------------------------------------------------------------------------------------------------------------------------------------------------------
        List<String> al = new ArrayList<>();//interfejs list jest implementowany przez ArrayList, LinkedList, Vector, Stack

        // List <T> al = new ArrayList<> ();
        //List <T> ll = new LinkedList<> ();
        // List <T> v = new Vector<> ();
        // Where T is the type of the object

        List<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------
        //   ArrayList vs Vector
        // Synchronizacja: Vector jest synchronizowany, ArrayList nie.
        //       Wydajność: ArrayList jest zazwyczaj szybsza niż Vector w środowiskach jednowątkowych.
        //       Rozszerzanie pojemności: Vector podwaja swoją pojemność, ArrayList zwiększa ją o 50%.
        // Zastosowanie: ArrayList jest preferowana w nowych projektach, Vector w starszych kodach, gdzie synchronizacja jest wymagana.

        //----------------------------------------------------------------------------------------------------------------------------------------------------------------
        Stack<String> stack = new Stack<>(); // Stack dziedziczy po Vector, posiada metody push, pop, peek, search, empty, size,  opiera się na LIFO

        stack.push("A");
        stack.push("B");
        Iterator<String> stringIterator = stack.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next() + "");
        }
        System.out.println();
        stack.pop();

        stringIterator = stack.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next() + "");
        }
        System.out.println();
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------

        Queue<Integer> queue = new PriorityQueue<>(); // Queue jest interfejsem, są to kolekcje FIFO, implementowane przez LinkedList, PriorityQueue, ArrayDeque
        Queue<String> ad = new ArrayDeque<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.peek());// zwraca pierwszy element kolejki
        System.out.println(queue.poll());// zwraca pierwszy element kolejki i usuwa go
        System.out.println(queue.peek());// zwraca pierwszy element kolejki

        //----------------------------------------------------------------------------------------------------------------------------------------------------------------

        Deque<String> qu = new ArrayDeque<>();// Deque jest interfejsem, są to kolekcje FIFO, implementowane przez LinkedList, ArrayDeque, Deque, znana również jako kolejka dwustronna, to struktura danych, w której możemy dodawać i usuwać elementy z obu końców kolejki.
        // Gdzie T jest typem obiektu.

        ArrayDeque<Integer> de_que
                = new ArrayDeque<Integer>(10);

        // add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        System.out.println(de_que);

        de_que.clear();

        de_que.addFirst(564);
        de_que.addFirst(291);

        // addLast() method to insert the
        // elements at the tail
        de_que.addLast(24);
        de_que.addLast(14);

        System.out.println(de_que);

        //----------------------------------------------------------------------------------------------------------------------------------------------------------------
        Set<String> hs = new HashSet<>();// Set jest interfejsem, są to kolekcje, które nie zawierają duplikatów, implementowane przez HashSet, LinkedHashSet, TreeSet
        Set<String> lhs = new LinkedHashSet<>();
        Set<String> ts = new TreeSet<>();

        HashSet<String> hashSet = new HashSet<String>();

        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");

        Iterator<String> iterator = hs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + "");

            SortedSet<String> treeSet = new TreeSet<> ();// SortedSet jest interfejsem, są to kolekcje, które są posortowane, implementowane przez TreeSet
           // Where T is the type of the object.
            treeSet.add("Geeks");
            treeSet.add("For");
            treeSet.add("Geeks");
            treeSet.add("Is");
            treeSet.add("Very helpful");

            // Traversing elements
            Iterator<String> itr = treeSet.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }

            //----------------------------------------------------------------------------------------------------------------------------------------------------------------

            Map<String, String> hm = new HashMap<> ();// mapa
            Map<Object, Object> tm = new TreeMap<> ();




        }
    }
}



