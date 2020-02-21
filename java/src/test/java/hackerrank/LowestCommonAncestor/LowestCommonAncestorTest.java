package hackerrank.LowestCommonAncestor;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class LowestCommonAncestorTest {

    @Test
    public void testing() {
        Node node = new Node(4);
        LowestCommonAncestor.insert(node, 2);
        LowestCommonAncestor.insert(node, 3);
        LowestCommonAncestor.insert(node, 1);
        LowestCommonAncestor.insert(node, 7);
        LowestCommonAncestor.insert(node, 6);
        Node result = LowestCommonAncestor.lca(node, 1, 7);
        Assert.assertEquals(4, result.data);
    }

    @Test
    public void testfindAncestorAlternate3() {
        Node node = new Node(1);
        LowestCommonAncestor.insert(node, 2);
        Node result = LowestCommonAncestor.lca(node, 1, 2);
        Assert.assertEquals(1, result.data);
    }

    @Test
    public void testfindAncestorAlternate4() {
        //5 3 8 2 4 6 7
        Node node = new Node(5);
        LowestCommonAncestor.insert(node, 3);
        LowestCommonAncestor.insert(node, 8);
        LowestCommonAncestor.insert(node, 2);
        LowestCommonAncestor.insert(node, 4);
        LowestCommonAncestor.insert(node, 6);
        LowestCommonAncestor.insert(node, 7);
        Node result = LowestCommonAncestor.lca(node, 1, 2);
        Assert.assertEquals(5, result.data);
    }

    @Ignore
    public void testfindAncestorAlternate5() {
        //8 4 9 1 2 3 6 5
        Node node = new Node(8);
        LowestCommonAncestor.insert(node, 4);
        LowestCommonAncestor.insert(node, 9);
        LowestCommonAncestor.insert(node, 1);
        LowestCommonAncestor.insert(node, 2);
        LowestCommonAncestor.insert(node, 3);
        LowestCommonAncestor.insert(node, 6);
        LowestCommonAncestor.insert(node, 5);
        Node result = LowestCommonAncestor.lca(node, 1, 2);
        Assert.assertEquals(1, result.data);
    }





}
