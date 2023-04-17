import java.util.Scanner;

public class PT4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            BST bst = new BST();
            int operation;

        System.out.print("Enter operation: ");
        operation = Integer.parseInt(scanner.nextLine());
        switch (operation) {
        case 1:
        bst.root = bst.createNode(4);
        bst.root.left = bst.createNode(2);
        bst.root.right = bst.createNode(7);
        bst.root.left.left = bst.createNode(1);
        bst.root.left.right = bst.createNode(3);
        bst.root.right.left = bst.createNode(6);
        bst.root.right.right = bst.createNode(8);
        bst.root.right.left.right = bst.createNode(7);
        bst.root.right.right.right = bst.createNode(11);
    if (bst.checkIfBST(bst.root))
    System.out.print("NOT A BST");
    else
    System.out.print("IS A BST");
    break;
        case 2:
        bst.root = bst.createNode(7);
        bst.root.left = bst.createNode(1);
        bst.root.right = bst.createNode(4);
        bst.root.left.left = bst.createNode(2);
        bst.root.left.right = bst.createNode(11);
        bst.root.right.left = bst.createNode(16);
        bst.root.right.right = bst.createNode(6);
        bst.root.right.left.right = bst.createNode(8);
        bst.root.right.right.right = bst.createNode(3);

    if (bst.checkIfBST(bst.root))
    System.out.print("IS A BST");
    else
    System.out.print("NOT A BST");
    break;
        case 3:
        bst.root = bst.createNode(15);
        bst.root.left = bst.createNode(12);
        bst.root.right = bst.createNode(17);
        bst.root.left.left = bst.createNode(10);
        bst.root.left.right = bst.createNode(13);
        bst.root.right.left = bst.createNode(16);
        bst.root.right.right = bst.createNode(18);
        bst.root.left.left.left = bst.createNode(8);
        bst.root.left.left.right = bst.createNode(11);
        bst.root.left.right.right = bst.createNode(14);

    if (bst.checkIfBST(bst.root))
    System.out.print("IS A BST");
    else
    System.out.print("NOT A BST");
    break;
        case 4:
        bst.root = bst.createNode(18);
        bst.root.left = bst.createNode(14);
        bst.root.right = bst.createNode(8);
        bst.root.left.left = bst.createNode(17);
        bst.root.left.right = bst.createNode(15);
        bst.root.right.left = bst.createNode(16);
        bst.root.right.right = bst.createNode(13);
        bst.root.left.left.left = bst.createNode(10);
        bst.root.left.left.right = bst.createNode(11);
        bst.root.left.right.right = bst.createNode(12);

    if (bst.checkIfBST(bst.root))
    System.out.print("IS A BST");
    else
    System.out.print("NOT A BST");
    break;
        case 5:
        bst.root = bst.createNode(13);
        bst.root.left = bst.createNode(12);
        bst.root.right = bst.createNode(10);
        bst.root.left.left = bst.createNode(14);
        bst.root.left.right = bst.createNode(16);
        bst.root.right.left = bst.createNode(15);
        bst.root.right.right = bst.createNode(11);
        bst.root.left.left.left = bst.createNode(8);
        bst.root.left.left.right = bst.createNode(18);
        bst.root.left.right.right = bst.createNode(17);

    if (bst.checkIfBST(bst.root))
    System.out.print("IS A BST");
    else
    System.out.print("NOT A BST");
    break;
        case 6:
        bst.root = bst.createNode(15);
        bst.root.left = bst.createNode(10);
        bst.root.right = bst.createNode(20);
        bst.root.left.left = bst.createNode(7);
        bst.root.left.right = bst.createNode(13);
        bst.root.right.left = bst.createNode(17);
        bst.root.right.right = bst.createNode(24);
        bst.root.left.left.left = bst.createNode(5);
        bst.root.left.left.right = bst.createNode(9);
        bst.root.left.right.left = bst.createNode(12);
        bst.root.left.right.right = bst.createNode(14);
        bst.root.right.left.left = bst.createNode(16);
        bst.root.right.left.right = bst.createNode(18);
        bst.root.right.right.left = bst.createNode(22);
        bst.root.right.right.right = bst.createNode(25);

    if (bst.checkIfBST(bst.root))
    System.out.print("IS A BST");
    else
    System.out.print("NOT A BST");
    break;
        default:
            break;
        }
    }
}

