package utils;

/**
 * Created by File on 2017/6/10.
 */
class Queue {
    Node first, last;

    public void enqueue(Node n) {
        if (first == null) {
            first = n;
            last = first;
        } else {
            last.next = n;
            last = n;
        }
    }

    public Node dequeue() {
        if (first == null) {
            return null;
        } else {
            Node temp = new Node(first.value);
            first = first.next;
            return temp;
        }
    }
}