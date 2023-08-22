
class Node:
    def __init__(self, data = None, next = None):
        self.data = data
        self.next = next

class LinkedList:
    def __init__(self):
        self.head = None

    def insert_beginning(self,data):

        if self.head is None:
            self.head = Node(data)

        else:
            node = Node(data, self.head)
            self.head = node

    def print(self):
        curr = self.head

        if curr is None:
            print("[]")

        else:
            statement = ''
            while curr:
                statement += (str(curr.data) + "-->")
                curr = curr.next

            print(statement)

    def insert_end(self, data):

        curr = self.head

        if self.head is None:
            self.head = Node(data)
            return

        while curr:
            if curr.next is None:
                node = Node(data)
                curr.next = node
                return
            else:
                curr = curr.next

    def get_length(self):
        curr = self.head
        count = 0

        while curr:
            count += 1
            curr = curr.next

        return count

    def remove_at(self, index):
        curr = self.head
        count = 0

        if index < 0 or index > self.get_length():
            print("invalid index")
            return

        else:
            while curr:
                count += 1

                if count == index-1:
                    curr.next = curr.next.next
                    return

                curr = curr.next


    def insert_at(self, data, index):

        curr = self.head
        count = 0

        while curr:

            if count == index - 1:
                node = Node(data)
                node.next = curr.next
                curr.next = node
                return

            else:
                count += 1
                curr = curr.next

ll = LinkedList()
ll.insert_end(5)
ll.insert_end(4)
ll.insert_end(3)
ll.insert_end(2)
ll.insert_end(1)
ll.insert_at(10,1)
ll.print()


