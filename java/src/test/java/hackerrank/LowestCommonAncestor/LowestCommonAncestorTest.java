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

    @Test
    public void testfindAncestorAlternate6() {
        //8 6 5 7 11 12 13 10 9
        Node node = new Node(8);
        LowestCommonAncestor.insert(node, 6);
        LowestCommonAncestor.insert(node, 5);
        LowestCommonAncestor.insert(node, 7);
        LowestCommonAncestor.insert(node, 11);
        LowestCommonAncestor.insert(node, 12);
        LowestCommonAncestor.insert(node, 13);
        LowestCommonAncestor.insert(node, 10);
        LowestCommonAncestor.insert(node, 9);
        Node result = LowestCommonAncestor.lca(node, 9, 12);
        Assert.assertEquals(11, result.data);
    }

    @Test
    public void testfindAncestorAlternate7() {
        //7 9 4 2 6 3 5 1
        Node node = new Node(7);
        LowestCommonAncestor.insert(node, 9);
        LowestCommonAncestor.insert(node, 4);
        LowestCommonAncestor.insert(node, 2);
        LowestCommonAncestor.insert(node, 6);
        LowestCommonAncestor.insert(node, 3);
        LowestCommonAncestor.insert(node, 5);
        LowestCommonAncestor.insert(node, 1);
        Node result = LowestCommonAncestor.lca(node, 7, 9);
        Assert.assertEquals(7, result.data);
    }





}
