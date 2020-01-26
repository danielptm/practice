package hackerrank.HeightOfBinaryTree;

import hackerrank.HeightOfBinaryTree.HeightOfBinaryTree;
import hackerrank.HeightOfBinaryTree.Node;
import org.junit.Assert;
import org.junit.Test;

public class HeightOfBinaryTreeTest {


    @Test
    public void testing() {
        Node node = new Node(3);
        HeightOfBinaryTree.insert(node, 2);
        HeightOfBinaryTree.insert(node, 1);
        HeightOfBinaryTree.insert(node, 5);
        HeightOfBinaryTree.insert(node, 4);
        HeightOfBinaryTree.insert(node, 6);
        HeightOfBinaryTree.insert(node, 7);

        int result = HeightOfBinaryTree.height(node);

        Assert.assertEquals(3, result);

    }

    @Test
    public void testing2() {
        int nodeListSize = 3;
        int nextLevel = 1 + 2;
        boolean levelUpExists = nodeListSize == nextLevel ? true : false;
        System.out.println(levelUpExists);
    }
}
