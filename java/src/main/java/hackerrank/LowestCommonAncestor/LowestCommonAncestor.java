package hackerrank.LowestCommonAncestor;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class LowestCommonAncestor {

    /**
     * 9/10 passing on hackerrank...
     * https://www.hackerrank.com/challenges/binary-search-tree-lowest-common-ancestor/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=trees
     * @param root
     * @param v1
     * @param v2
     * @return
     */
    public static Node lca(Node root, int v1, int v2) {
        List<List<Node>> list = breakNodesIntoArrays(root);
        Node result = findAncestor(list, v1, v2);
        return result;
    }

    public static List<List<Node>> breakNodesIntoArrays(Node node) {
        List<List<Node>> list = new ArrayList<>();
        List<Node> nodes = new ArrayList<>();
        nodes.add(node);
        list.add(nodes);

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                Node thisNode = list.get(i).get(j);
//                int nextList = i;
                int nextList = i + 1;
                if ((i == (list.size() - 1))) {
                    List<Node> newList = new ArrayList<>();
                    list.add(newList);
                }
                if (thisNode.left != null) {
                    list.get(nextList).add(thisNode.left);
                }
                if (thisNode.right != null) {
                    list.get(nextList).add(thisNode.right);
                }
            }
        }

        return list;
    }

    public static int findVLevel(int v, List<List<Node>> list) {
        int index = -1;
        for(int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                int data = list.get(i).get(j).data;
                if ( data == v) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    public static Node findAncestor(List<List<Node>> list, int v1, int v2) {
        Node theParent = null;
        int v1ParentNodeData = v1;
        int v2ParentNodeData = v2;

        List<Node> v1ParentNodes = new ArrayList<>();

        int v1Level = findVLevel(v1, list);
        int v2Level = findVLevel(v2, list);

        for (int i = (v1Level - 1); 0 <= i; i--) {
            for (int j = 0; j < list.get(i).size(); j++) {
                Node thisNode = list.get(i).get(j);
                int left = thisNode.left != null ? thisNode.left.data : -1;
                int right = thisNode.right != null ? thisNode.right.data : -1;
                if ((left == v1ParentNodeData) || (right == v1ParentNodeData)) {
                    v1ParentNodeData = thisNode.data;
                    v1ParentNodes.add(thisNode);
                }
            }
        }

        for (int i = (v2Level - 1); 0 <= i; i--) {
            for (int j = 0; j < list.get(i).size(); j++) {
                Node thisNode = list.get(i).get(j);
                int left = thisNode.left != null ? thisNode.left.data : -1;
                int right = thisNode.right != null ? thisNode.right.data : -1;
                if ((left == v2ParentNodeData) || (right == v2ParentNodeData)) {
                    if (!v1ParentNodes.contains(thisNode)) {
                        v2ParentNodeData = thisNode.data;
                        v1ParentNodes.add(thisNode);
                    } else {
                        theParent = thisNode;
                        break;
                    }
                }
            }
        }
        if (theParent == null) {
            theParent = v1ParentNodes.get(v1ParentNodes.size() -1);
        }

        return theParent;
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