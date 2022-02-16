package leetcode.algorithmpractice.bfs;

import java.util.ArrayList;
import java.util.List;

public class SameTree {

    // https://leetcode.com/problems/same-tree/
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p != null && q == null) || (p == null && q != null)) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        List<TreeNode> p_list = new ArrayList<>();
        List<TreeNode> q_list = new ArrayList<>();

        p_list.add(p);
        q_list.add(q);

        while (!p_list.isEmpty() && !q_list.isEmpty()) {
            TreeNode p_n = p_list.remove(0);
            TreeNode q_n = q_list.remove(0);
            if ((p_n != null) && (q_n != null)) {
                if (equals(p_n, q_n)) {
                    p_list.add(p_n.left);
                    p_list.add(p_n.right);
                    q_list.add(q_n.left);
                    q_list.add(q_n.right);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean equals(TreeNode a, TreeNode b) {
        if (existsEquals(a.left, b.left) && existsEquals(a.right, b.right) && (a.val == b.val)) {
            return true;
        }
        return false;
    }

    public boolean existsEquals(TreeNode left, TreeNode right) {
        if ( left == null && right == null) {
            return true;
        } else if (left != null && right != null) {
            return true;
        }
        return false;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
