package leetcode.algorithmpractice.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaxDepthBinaryTree {

    private Stack<TreeNode> stack;

    public MaxDepthBinaryTree() {
        this.stack = new Stack<>();
    }

    public int maxDepth(TreeNode root) {
        List<TreeNode> nodes = new ArrayList<>();
        if (root.left != null) {
            nodes.add(root.left);
        }
        if (root.right != null) {
            nodes.add(root.right);
        }
        int count = dfs(nodes);
        return count;
    }

    public int dfs(List<TreeNode> nodes) {
        int count = 1;
        for (TreeNode node: nodes) {
            stack.add(node);
            while (!stack.isEmpty()) {
                TreeNode curr = stack.pop();
                List<TreeNode> currNodes = new ArrayList<>();
                if (curr.left != null) {
                    currNodes.add(curr.left);
                }
                if (curr.right != null) {
                    currNodes.add(curr.right);
                }
                boolean isCounted = false;
                for (TreeNode n: currNodes) {
                    if (!isCounted) {
                        count = count + 1;
                        isCounted = true;
                    }
                    stack.add(n);
                }
                if (currNodes.size() == 0) {
                    count = count + 1;
                }
            }
        }
        return count;
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
