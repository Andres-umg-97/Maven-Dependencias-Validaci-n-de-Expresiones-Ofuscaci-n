package stackHandler.handler;

public class MyStack {

    private Node top;
    private int count;

    public MyStack() {
        this.top = null;
        this.count = 0;
    }

    public void push(char data) {
        Node newNode = new Node(data);
        newNode.setNext(top);
        top = newNode;
        count++;
    }

    public char pop() {
        if (isEmpty()) {
            return '\0';
        }
        char value = top.getData();
        top = top.getNext();
        count--;
        return value;
    }

    public char peek() {
        return isEmpty() ? '\0' : top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getCount() {
        return count;
    }

    public int getSize() {
        return count;
    }

    public int length() {
        return count;
    }

    // Devuelve el nodo
    public Node getNodeInit() {
        if (isEmpty()) return null;

        Node current = top;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }
}
