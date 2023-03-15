import java.util.Scanner;

public class LinkedListImplement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of list: ");
        int size = scanner.nextInt();
        DoublyLinkedList list = new DoublyLinkedList();
        System.out.print("Enter the elements of the list: ");
        for (int counter = 0; counter < size; counter++) {
            int element = scanner.nextInt();
            list.insert(element);
        }
        System.out.print("The list  is: ");
        list.display();

        System.out.println("Choose a Operation");
        System.out.println("[1] Insert");
        System.out.println("[2] Delete");
        System.out.println("[3] Traverse");
        System.out.println("[0] Exit");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
            System.out.print("Enter the element to insert: ");
            int element = scanner.nextInt();
            System.out.print("Enter the index to insert at: ");
            int index = scanner.nextInt();
            Node newNode = new Node(element);
            Node current = list.head;
            for (int counter = 0; counter < index - 1; counter++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            System.out.print("The list after insertion is: ");
            list.display();
                break;

            case 2:
            System.out.print("Enter the index to delete: ");
            int deleteIndex = scanner.nextInt();
            current = list.head;
            for (int counter = 0; counter < deleteIndex; counter++) {
                current = current.next;
            }
            if (current == list.head) {
                list.head = current.next;
            } else {
                current.prev.next = current.next;
            }
            if (current == list.tail) {
                list.tail = current.prev;
            } else {
                current.next.prev = current.prev;
            }
            current.prev = null;
            current.next = null;
            System.out.print("The list after deletion is: ");
            list.display();
        
                break;

            case 3:
            System.out.print("The list is: ");
            list.display();
                break;
            
            case 0:
                return;
            default:
                return;
        }
    }
}

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
    }

    void display() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
