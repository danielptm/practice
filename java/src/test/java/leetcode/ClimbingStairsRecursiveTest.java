package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsRecursiveTest {

  @Test
  public void test1() {
    ClimbingStairsRecursive csr = new ClimbingStairsRecursive();
    int res = csr.climbStairs(2);
    Assert.assertEquals(2, res);
  }

  @Test
  public void test2() {
    ClimbingStairsRecursive csr = new ClimbingStairsRecursive();
    int res = csr.climbStairs(3);
    Assert.assertEquals(3, res);
  }

  @Test
  public void test3() {
    ClimbingStairsRecursive csr = new ClimbingStairsRecursive();
    int res = csr.climbStairs(30);
    Assert.assertEquals(3, res);
  }
}
