public class SinglyLinkedListApp {
    private static SinglyLinkedList list = new SinglyLinkedList();

    public static void main(String[] args) {
        list.addFirst("A");
        list.addLast("Z");
        list.addAfter("A", "B");
        list.addAfter("B", "C");
        list.addAfter("C", "D");
        list.addAfter("D", "E");
        list.addAfter("E", "F");
        list.addAfter("F", "G");
        list.addAfter("G", "H");

        System.out.println(list);

        Node last = list.removeLast();
        last = null;

        System.out.println(list);

        Node first = list.removeFirst();
        first = null;

        System.out.println(list);

        Node removedNode = list.removeAfter("E");
        removedNode = null;

        System.out.println(list);
    }
}
