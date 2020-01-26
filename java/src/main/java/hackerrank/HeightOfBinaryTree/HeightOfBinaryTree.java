package hackerrank.HeightOfBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class HeightOfBinaryTree {


    public static int height(Node root) {
        List<List<Node>> listOfNodes = new ArrayList<>();
        listOfNodes.add(new ArrayList<>());
        listOfNodes.get(0).add(root);
        int nodeListSize = listOfNodes.size();
        for (int i = 0; i < nodeListSize; i++) {
            int innerArraySize = listOfNodes.get(i).size();
            for(int j = 0; j < innerArraySize; j++) {
                int nextLevel = i + 2;
                int indexForNextLevel = i + 1;
                boolean nextLevelExists = nodeListSize == nextLevel ? true : false;
                Node currLeft = listOfNodes.get(i).get(j).left;
                Node currRight = listOfNodes.get(i).get(j).right;
                List<Node> newList = new ArrayList<>();
                if (currLeft!=null) {
                    if (nextLevelExists) {
                        listOfNodes.get(indexForNextLevel).add(currLeft);
                    } else {
                        newList.add(currLeft);
                    }
                }
                if (currRight!=null) {
                    if (nextLevelExists) {
                        listOfNodes.get(indexForNextLevel).add(currRight);
                    } else {
                        newList.add(currRight);
                    }
                }
                if (!newList.isEmpty()) {
                    listOfNodes.add(newList);
                }
                nodeListSize = listOfNodes.size();
            }
        }
        return listOfNodes.size() - 1;
    }

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
    boolean isChecked;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
        isChecked = false;
    }
}
