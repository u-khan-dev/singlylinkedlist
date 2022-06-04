public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() { head = null; }

    void addFirst(String str) {
        Node first = new Node(str);
        first.setNext(head);
        head = first;
    }

    void addAfter(String insertAfter, String inputString) {
        Node curr = head;

        while (curr != null) {
            if (curr.getElement() == insertAfter) {
                Node newNode = new Node(inputString);
                newNode.setNext(curr.getNext());
                curr.setNext(newNode);
                break;
            }

            curr = curr.getNext();
        }
    }

    void addLast(String str) {
        if (head == null) {
            head = new Node(str);
        } else {
            Node curr = head;

            while (curr.getNext() != null) {
                curr = curr.getNext();
            }

            curr.setNext(new Node(str));
        }
    }

    Node removeFirst() {
        if (head != null) {
            Node delNode = head;
            head = head.getNext();
            return delNode;
        }

        return null;
    }

    Node removeAfter(String str) {
        Node curr = head;
        Node delNode = null;

        while (curr != null) {
            if (curr.getElement() == str && curr.getNext() != null) {
                delNode = curr.getNext();
                curr.setNext(delNode.getNext());
                break;
            }

            curr = curr.getNext();
        }

        return delNode;
    }

    Node removeLast() {
        Node curr = head;

        if (curr == null || curr.getNext() == null) {
            head = null;
            return curr;
        }

        Node nextNode = curr.getNext();

        while (curr.getNext() != null) {
            if (nextNode.getNext() == null) {
                curr.setNext(null);
            }

            curr = nextNode;
            nextNode = nextNode.getNext();
        }

        return curr;
    }

    @Override
    public String toString() {
        Node curr = head;

        String output = "\n[ ";

        while (curr.getNext() != null) {
            output += curr.getElement() + ", ";
            curr = curr.getNext();
        }

        output += curr.getElement() + " ]";

        return output;
    }
}
