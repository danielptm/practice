package leetcode.algorithmpractice.dfs;

import java.util.*;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaxDepthBinaryTree {

    private List<Integer> counts = new ArrayList<>();

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        recurse(root, 0);
        Collections.sort(this.counts);
        return this.counts.get(this.counts.size() - 1);
    }

    public void recurse(TreeNode node, int count) {
        count = count + 1;
        counts.add(count);
        if (node.left != null) {
            recurse(node.left, count);
        }
        if (node.right != null) {
            recurse(node.right, count);
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
