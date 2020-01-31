package hackerrank.LowestCommonAncestor;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

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

    @Ignore
    public void testbreakNodesIntoArrays() {
        Node node = new Node(4);
        LowestCommonAncestor.insert(node, 2);
        LowestCommonAncestor.insert(node, 3);
        LowestCommonAncestor.insert(node, 1);
        LowestCommonAncestor.insert(node, 7);
        LowestCommonAncestor.insert(node, 6);

        List<List<Node>> result = LowestCommonAncestor.breakNodesIntoArrays(node);

        Assert.assertEquals(3, result.size());
        Assert.assertEquals(1, result.get(0).size());
        Assert.assertEquals(2, result.get(1).size());
        Assert.assertEquals(3, result.get(2).size());
    }

    @Ignore
    public void testbreakNodesIntoArrays2() {
        Node node = new Node(1);
        LowestCommonAncestor.insert(node, 2);

        List<List<Node>> result = LowestCommonAncestor.breakNodesIntoArrays(node);


        Assert.assertEquals(3, result.size());
        Assert.assertEquals(1, result.get(0).size());
        Assert.assertEquals(2, result.get(1).size());
        Assert.assertEquals(3, result.get(2).size());
    }

    @Test
    public void testfindVLevel() {
        Node node = new Node(4);
        LowestCommonAncestor.insert(node, 2);
        LowestCommonAncestor.insert(node, 7);
        int v = 2;
        List<List<Node>> list = LowestCommonAncestor.breakNodesIntoArrays(node);
        int result = LowestCommonAncestor.findVLevel(v, list);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testfindAncestor() {
        Node node = new Node(4);
        LowestCommonAncestor.insert(node, 2);
        LowestCommonAncestor.insert(node, 3);
        LowestCommonAncestor.insert(node, 1);
        LowestCommonAncestor.insert(node, 7);
        LowestCommonAncestor.insert(node, 6);
        List<List<Node>> list = LowestCommonAncestor.breakNodesIntoArrays(node);
        Node result = LowestCommonAncestor.lca(node, 1, 7);
        Assert.assertEquals(4, result.data);
    }

    @Test
    public void testfindAncestorAlternate() {
        Node node = new Node(4);
        LowestCommonAncestor.insert(node, 2);
        LowestCommonAncestor.insert(node, 3);
        LowestCommonAncestor.insert(node, 1);
        LowestCommonAncestor.insert(node, 7);
        LowestCommonAncestor.insert(node, 6);
        List<List<Node>> list = LowestCommonAncestor.breakNodesIntoArrays(node);
        Node result = LowestCommonAncestor.lca(node, 1, 6);
        Assert.assertEquals(4, result.data);
    }

    @Test
    public void testfindAncestorAlternate2() {
        Node node = new Node(4);
        LowestCommonAncestor.insert(node, 2);
        LowestCommonAncestor.insert(node, 3);
        LowestCommonAncestor.insert(node, 1);
        LowestCommonAncestor.insert(node, 7);
        LowestCommonAncestor.insert(node, 6);
        Node result = LowestCommonAncestor.lca(node, 1, 3);
        Assert.assertEquals(2, result.data);
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



}
