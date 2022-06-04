from SinglyLinkedList import SinglyLinkedList


def main():
    linkedList = SinglyLinkedList()

    linkedList.addFirst(1)
    linkedList.addAfter(1, 2)
    linkedList.addAfter(2, 3)
    linkedList.addAfter(3, 4)
    linkedList.addAfter(4, 5)
    linkedList.addAfter(5, 6)
    linkedList.addAfter(6, 7)
    linkedList.addAfter(7, 8)

    linkedList.printList()

    junkNode = linkedList.removeFirst()

    linkedList.printList()

    junkNode = linkedList.removeLast()

    linkedList.printList()

    junkNode = linkedList.removeAfter(4)

    linkedList.printList()

    junkNode = None


if __name__ == '__main__':
    main()
