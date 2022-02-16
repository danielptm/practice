package leetcode.algorithmpractice.bfs;

import org.junit.Assert;
import org.junit.Test;

public class SameTreeTest {

    @Test
    public void testIsSameTree() {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode treeNode2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        boolean res = new SameTree().isSameTree(treeNode, treeNode2);
        Assert.assertEquals(true, res);
    }
}
