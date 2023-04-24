import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inorderTrav(Node node) {
        if (node != null) {
            inorderTrav(node.left);
            System.out.print(node.data + " ");
            inorderTrav(node.right);
        }
    }

    void preorderTrav(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTrav(node.left);
            preorderTrav(node.right);
        }
    }

    void postorderTrav(Node node) {
        if (node != null) {
            postorderTrav(node.left);
            postorderTrav(node.right);
            System.out.print(node.data + " ");
        }
    }
}

public class PT5DSA {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of the binary tree: ");
        int sizeTree = obj.nextInt();
        BinaryTree tree = new BinaryTree();
        System.out.print("Enter the elements of the binary tree: ");
        for (int counter = 0; counter < sizeTree; counter++) {
            int element = obj.nextInt();
            tree.insert(element);
        }
        System.out.println("Binary tree created successfully!");
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("[1] In-order Traversal");
            System.out.println("[2] Pre-order Traversal");
            System.out.println("[3] Post-order Traversal");
            System.out.print("Your choice (0 to exit): ");
            int choice = obj.nextInt();
            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.print("In-order Traversal: ");
                    tree.inorderTrav(tree.root);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Pre-order Traversal: ");
                    tree.preorderTrav(tree.root);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Post-order Traversal: ");
                    tree.postorderTrav(tree.root);
                    System.out.println();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        obj.close();
    }
}
