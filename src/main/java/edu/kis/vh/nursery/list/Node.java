package edu.kis.vh.nursery.list;

class Node {

    public int getValue() {
        return value;
    }

    private final int value;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    private Node prev, next;

    public Node(int i) {
        value = i;
    }

}
