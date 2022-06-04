public class Node {
    private String element;
    private Node next;

    public Node(String str) {
        element = str;
        next = null;
    }

    public String getElement() { return element; }
    public Node getNext() { return next; }

    public void setNext(Node newNext) { next = newNext; }
}
