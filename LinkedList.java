import java.util.Scanner;

class LinkedList {
    private Node head;
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int maxSize = scanner.nextInt();

        for (int counter = 0; counter < maxSize; counter++) {
            System.out.print("Enter element " + (counter+1) + ": ");
            int ElementInsert = scanner.nextInt();
            list.end(ElementInsert);
        }

        System.out.print("Enter the element to add at the beginning: ");
        int ElementInsert = scanner.nextInt();
        list.Beginning(ElementInsert);

        System.out.print("Enter the element to add at the end: ");
        ElementInsert = scanner.nextInt();
        list.end(ElementInsert);

        System.out.println("Linked list:");
        list.LinkedListPrint();

        System.out.print("Enter the element to add: ");
        ElementInsert = scanner.nextInt();
        System.out.print("Enter the index to insert the element: ");
        int index = scanner.nextInt();
        list.insertAtIndex(ElementInsert, index);

        System.out.println("Final Linked list:");
        list.LinkedListPrint();

        System.out.println();
    }
    public LinkedList() {
        head = null;
    }

    public void Beginning(int ElementInsert) {
        Node newNode = new Node(ElementInsert);
        newNode.next = head;
        head = newNode;
    }

    public void end(int ElementInsert) {
        Node newNode = new Node(ElementInsert);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtIndex(int ElementInsert, int index) {
        Node newNode = new Node(ElementInsert);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current.next == null) {
                    throw new IndexOutOfBoundsException();
                }
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void LinkedListPrint() {
        Node current = head;
        while (current != null) {
            System.out.print(current.ElementInsert + " ");
            current = current.next;
        }
        System.out.println();
    }

}

class Node {
    int ElementInsert;
    Node next;

    public Node(int ElementInsert) {
        this.ElementInsert = ElementInsert;
        next = null;
    }
}
