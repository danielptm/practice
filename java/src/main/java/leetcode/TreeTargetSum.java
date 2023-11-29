package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TtSTreeNode {
      int val;
      TtSTreeNode left;
      TtSTreeNode right;
      TtSTreeNode() {}
      TtSTreeNode(int val) { this.val = val; }
      TtSTreeNode(int val, TtSTreeNode left, TtSTreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class TreeTargetSum {
    public boolean hasPathSum(TtSTreeNode root, int targetSum) {
        List<TtSTreeNode> nodes = new ArrayList<>();
        LinkedList<Integer> fifo = new LinkedList<Integer>();

        fifo.add(root.val);
        nodes.add(root);

        while (nodes.size() > 0) {
            TtSTreeNode curr = nodes.remove(0);
            int currVal = fifo.pop();

            int leftVal = 0;
            if (curr.left != null) {
                leftVal = leftVal + currVal + curr.left.val;
                if (leftVal == targetSum) {
                    return true;
                }
            }
            int rightVal = 0;
            if (curr.right != null) {
                rightVal = rightVal + currVal + curr.right.val;
                if (rightVal == targetSum) {
                    return true;
                }
            }
            if (leftVal != 0) {
                fifo.add(leftVal);
                nodes.add(curr.left);
            }
            if (rightVal != 0) {
                nodes.add(curr.right);
                fifo.add(rightVal);
            }
        }
        return false;
    }
}
