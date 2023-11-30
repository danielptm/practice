package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class TreeTargetSumTest {

    @Test
    public void hasPathSum() {
        TtSTreeNode tn = new TtSTreeNode();
        tn.val = 1;
        TtSTreeNode left = new TtSTreeNode();
        TtSTreeNode right = new TtSTreeNode();
        left.val = 2;
        right.val = 3;
        tn.left = left;
        tn.right = right;

        TreeTargetSum tts = new TreeTargetSum();
        boolean result = tts.hasPathSum(tn, 5);
        boolean expected = false;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void hasPathSum2() {
        TtSTreeNode tn = new TtSTreeNode();
        tn.val = 5;
        TtSTreeNode left = new TtSTreeNode();
        TtSTreeNode right = new TtSTreeNode();
        left.val = 4;
        right.val = 8;
        tn.left = left;
        tn.right = right;

        TreeTargetSum tts = new TreeTargetSum();
        boolean result = tts.hasPathSum(tn, 5);
        boolean expected = false;
        Assert.assertEquals(expected, result);
    }
}
