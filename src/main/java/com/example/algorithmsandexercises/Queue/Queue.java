package com.example.algorithmsandexercises.Queue;
interface Queue<E> {
    /**
     * zwraca ilosc elementow w kolejce
     * @return ilosc elementow w kolejce
     */
    int size();
    /**
     * sprawdzenie, czy kolejka jest pusta
     * @return true jesli kolejka pusta, false w przeciwnym wypadku
     */
    boolean isEmpty();
    /**
     * dodawanie elementu na koniec kolejki
     * @param e element do dodania
     */
    void enqueue(E e);
    /**
     * zwrocenie elementu na poczatku kolejki
     * @return element na poczatku kolejki, null jesli kolejka pusta
     */
    E front();
    /**
     * usuwanie i zwracane elementu na poczatku kolejki
     * @return usuwany element i zwracany lub null jesli kolejka pusta
     */
    E dequeue();
}