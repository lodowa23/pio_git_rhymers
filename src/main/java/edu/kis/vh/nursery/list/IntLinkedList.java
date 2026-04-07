package edu.kis.vh.nursery.list;

class IntLinkedList {

    public static final int RETURN = -1;
    public static final Node NULL = null;
    public static final boolean IS_FULL = false;
    private Node last;

    public void push(int i) {
        if (last == NULL)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    public boolean isEmpty() {
        return last == NULL;
    }

    public boolean isFull() {
        return IS_FULL;
    }

    public int top() {
        if (isEmpty())
            return RETURN;
        return last.getValue();
    }

    public int pop() {
        if (isEmpty())
            return RETURN;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

}
