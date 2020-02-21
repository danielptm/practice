package hackerrank.LowestCommonAncestor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LowestCommonAncestor {


    public static Node lca(Node root, int v1, int v2) {
        //Node is parent to both if it is parent of both v1 and v2 and it is the largest number parent

        List<Integer> v1Parents = new ArrayList<>();
        List<Integer> v2Parents = new ArrayList<>();

        v1Parents.add(root.data);
        v2Parents.add(root.data);

        Node currentNode = root;

        findParents(currentNode.data, currentNode, v1Parents, v2Parents);

        Collections.sort(v1Parents);
        Collections.sort(v2Parents);

        int parent = -1;
        for (int i = v1Parents.size() - 1; i >= 0 ; i--) {
            if (v2Parents.contains(v1Parents.get(i))) {
                parent = v1Parents.get(i);
            }
        }
        // Write your code here.
        return new Node(parent);
    }

    public static void findParents (int rootData, Node node, List<Integer> v1Parents, List<Integer> v2parents) {
        if (node.left != null) {
            if (node.left.data <= rootData) {
                v1Parents.add(node.left.data);
                findParents(rootData, node.left, v1Parents, v1Parents);
            }
        }
        if (node.right != null) {
            if (node.right.data >= rootData) {
                v1Parents.add(node.right.data);
                findParents(rootData, node.right, v1Parents, v1Parents);
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