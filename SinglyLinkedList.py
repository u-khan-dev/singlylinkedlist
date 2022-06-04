from Node import Node


class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def addFirst(self, newNumber):
        newNode = Node(newNumber)
        newNode.next = self.head
        self.head = newNode

    def addAfter(self, afterNumber, newNumber):
        curr = self.head

        while curr is not None:
            if curr.data == afterNumber:
                newNode = Node(newNumber)
                newNode.next = curr.next
                curr.next = newNode
                break

            curr = curr.next

    def addLast(self, newNumber):
        if self.head is None:
            self.head = Node(newNumber)
        else:
            curr = self.head

            while curr.next is not None:
                curr = curr.next

            curr.next = Node(newNumber)

    def removeFirst(self):
        if self.head is not None:
            delNode = self.head
            self.head = self.head.next
            return delNode

        return None

    def removeAfter(self, removeAfterNumber):
        curr = self.head

        while curr is not None:
            if curr.data == removeAfterNumber and curr.next is not None:
                delNode = curr.next
                curr.next = delNode.next
                break

            curr = curr.next

        return delNode

    def removeLast(self):
        curr = self.head

        if curr is None or curr.next is None:
            self.head = None
            return curr

        nextNode = curr.next

        while curr.next is not None:
            if nextNode.next is None:
                curr.next = None

            curr = nextNode
            nextNode = nextNode.next

        return curr

    def printList(self):
        curr = self.head

        print()

        while curr:
            print(curr.data, end=' ')
            curr = curr.next

        print()
