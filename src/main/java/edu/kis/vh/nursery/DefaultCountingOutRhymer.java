package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer służy do przechowywania i zarządzania serią liczb całkowitych.
 * Działa na zasadzie zbliżonej do stosu (LIFO - Last In, First Out).
 */

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int TOTAL_INIT = -1;
    public static final int TOTAL_FULL = MAX_SIZE - 1;
    public static final int RETURN = -1;
    private final int[] numbers = new int[MAX_SIZE];
    private int total = TOTAL_INIT;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Dodaje nową liczbę do stosu, jeśli nie jest on pełny.
     * * @param in liczba całkowita, która ma zostać dodana.
     */

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     * * @return true, jeśli stos nie zawiera żadnych liczb, w przeciwnym razie false.
     */

    public boolean callCheck() {
        return total == TOTAL_INIT;
    }

    /**
     * Sprawdza, czy stos osiągnął swój maksymalny rozmiar.
     * * @return true, jeśli tablica jest pełna, w przeciwnym razie false.
     */

    public boolean isFull() {
        return total == TOTAL_FULL;
    }

    /**
     * Zwraca ostatnio dodaną liczbę bez usuwania jej ze stosu.
     * * @return ostatnia liczba na stosie lub wartość RETURN (-1), jeśli stos jest pusty.
     */

    protected int peekaboo() {
        if (callCheck())
            return RETURN;
        return numbers[total];
    }

    /**
     * Zwraca ostatnio dodaną liczbę i usuwa ją ze stosu.
     * * @return ostatnia liczba na stosie lub wartość RETURN (-1), jeśli stos jest pusty.
     */

    public int countOut() {
        if (callCheck())
            return RETURN;
        return numbers[total--];
    }

}
