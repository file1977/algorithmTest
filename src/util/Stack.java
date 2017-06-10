package util;

/**
 * Created by File on 2017/6/10.
 */
public class Stack {
    Node top;

    public Node peek() {
        if (top != null) {
            return top;
        }

        return null;
    }

    public Node pop() {
        if (top == null) {
            return null;
        } else {
            Node temp = new Node(top.value);
            top = top.next;
            return temp;
        }
    }

    public void push(Node n) {
        if (n != null) {
            n.next = top;
            top = n;
        }
    }
}
