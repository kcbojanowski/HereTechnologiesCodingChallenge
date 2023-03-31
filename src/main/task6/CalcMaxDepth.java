package main.task6;

class Node {
    Node left;
    Node right;
}

public class CalcMaxDepth {
    public static int maxDepth(Node root) {
        if (root == null) {
            // Base case
            return 0;
        } else {
            // Recursive case - maximum depth is 1 + maximum depth of subtree
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return 1 + Math.max(leftDepth, rightDepth);
        }
    }

    public static void main(String[] args) {
        /* Test binary tree:
                   root
                  /    \
                 /      \
              left     right
               / \      / \
              /   \    /   \
            ll   lr   rl   rr
            /                \
          lll                rrr

         The maximum depth of this tree is 4
         */
        Node root = new Node();
        root.left = new Node();
        root.right = new Node();
        root.left.left = new Node();
        root.left.right = new Node();
        root.right.left = new Node();
        root.right.right = new Node();
        root.left.left.left = new Node();
        root.right.right.right = new Node();

        int maxDepth = CalcMaxDepth.maxDepth(root);
        System.out.println("Max Depth of binary tree: ");
        System.out.println(maxDepth);
    }
}