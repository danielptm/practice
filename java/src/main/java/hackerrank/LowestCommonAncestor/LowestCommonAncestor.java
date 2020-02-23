package hackerrank.LowestCommonAncestor;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {


    public static Node lca(Node root, int v1, int v2) {
        //Node is parent to both if it is parent of both v1 and v2 and it is the largest number parent
        Node currentNode = root;
        Node parent = findParents(v1, v2, currentNode);
        // Write your code here.
        return parent;
    }

    public static Node findParents (int v1, int v2, Node node) {
        if (v1 == node.data || v2 == node.data) {
            return node;
        }
        int min = Math.min(v1, v2);
        int max = Math.max(v1, v2);
        if (node.left != null && node.right != null) {
            if (node.data > min && node.data < max) {
                return node;
            } else {
                if (v1 > node.data && v2 > node.data) {
                    return findParents(v1, v2, node.right);
                } else {
                    return findParents(v1, v2, node.left);
                }
            }
        } else {
            if (node.left != null) {
                return findParents(v1, v2, node.left);
            } else {
                return findParents(v1, v2, node.right);
            }
        }
    }

    /**
     * I did not write this, this is provided by hackerrank for solving the problem.
     * @param root
     * @param data
     * @return
     */
    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
}


class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}