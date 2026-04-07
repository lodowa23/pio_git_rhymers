package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int TAB = 12;
    public static final int TOTAL1 = -1;
    public static final int TOTAL11 = 11;
    public static final int RET = -1;
    private final int[] numbers = new int[TAB];
    private int total = TOTAL1;

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
        return total == TOTAL1;
    }

    public boolean isFull() {
        return total == TOTAL11;
    }

    protected int peekaboo() {
        if (callCheck())
            return RET;
        return numbers[total--];
    }

    public int countOut() {
        if (callCheck())
            return RET;
        return numbers[total--];
    }

}
