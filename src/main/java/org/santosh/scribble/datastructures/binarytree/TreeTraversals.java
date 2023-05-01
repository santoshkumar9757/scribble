package org.santosh.scribble.datastructures.binarytree;

public class TreeTraversals {

    //https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/
    private static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+ "->");
        inOrder(root.right);
    }

    private static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data+ "->");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "->");
    }

    private static boolean isBST (Node root, Node left, Node right) {
        if (root == null) {
            return true;
        }
        if (left != null && root.data <= left.data) {
            return false;
        }

        if (right != null && root.data >= right.data) {
            return false;
        }

        return isBST(root.left, left, root)
                && isBST(root.right, root, right);
    }

    private static int height(Node node) {
        if (node == null)
            return 0;
        else {
            /* compute the height of each subtree */
            int lheight = height(node.left);
            int rheight = height(node.right);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Pre Order ==> ");
        preOrder(root);
        System.out.print("\nPost Order ==> ");
        postOrder(root);
        System.out.print("\nIn Order ==> ");
        inOrder(root);
        System.out.println();
        System.out.print("Is BST=>" +isBST(root, null, null));

        System.out.println();
        System.out.print("Height of the tree is ->"+ height(root));
    }

}

class Node {
    int data;
    Node left;
    Node right;

    Node (int key) {
        data = key;
        left = right = null;
    }
}

