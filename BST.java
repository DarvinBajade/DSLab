public class BST {
    public Node root;
    public Node createNode(int value) {
        Node node = new Node();
        node.value = value;
        node.left = null;
        node.right = null;
        return node;
    }
 public boolean checkIfBST(Node node) {
        return checkIfBST(node, Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
 private boolean checkIfBST(Node node, int minValue, int maxValue) {
        if (node == null) {
        return true;
    }
        if (node.value < minValue || node.value > maxValue) {
        return false;
    }
 return checkIfBST(node.left, minValue, node.value - 1) &&
 checkIfBST(node.right, node.value + 1, maxValue);
 }
 // Hey there, implement the function checkIfBST() here...
 public class Node {
    int value;
    Node left;
    Node right;
}
}
