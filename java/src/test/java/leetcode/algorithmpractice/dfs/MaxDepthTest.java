package leetcode.algorithmpractice.dfs;

import org.junit.Assert;
import org.junit.Test;

public class MaxDepthTest {

    @Test
    public void testMaxDepth() {
        MaxDepthBinaryTree tree = new MaxDepthBinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode right20 = new TreeNode(7);
        TreeNode left20 = new TreeNode(15);
        TreeNode twenty = new TreeNode(20);
        twenty.right = right20;
        twenty.left = left20;
        root.right = twenty;
        int res = tree.maxDepth(root);
        Assert.assertEquals(3, res);
    }

    @Test
    public void testMaxDepth2() {
        MaxDepthBinaryTree tree = new MaxDepthBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        int res = tree.maxDepth(root);
        Assert.assertEquals(2, res);
    }
}

