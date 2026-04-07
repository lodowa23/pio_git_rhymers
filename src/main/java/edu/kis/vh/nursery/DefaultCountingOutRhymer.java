package edu.kis.vh.nursery;

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

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTAL_INIT;
    }

    public boolean isFull() {
        return total == TOTAL_FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN;
        return numbers[total--];
    }

    public int countOut() {
        if (callCheck())
            return RETURN;
        return numbers[total--];
    }

}
