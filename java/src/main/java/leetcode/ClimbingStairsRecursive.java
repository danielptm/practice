package leetcode;


import java.util.Stack;

public class ClimbingStairsRecursive {

  public int climbStairs(int n) {
    int count = 0;
    Stack<Node> nodeStack = new Stack<>();
    Node iNode = new Node("", n);
    nodeStack.add(iNode);
    while (!nodeStack.isEmpty()) {
      Node node = nodeStack.pop();
      if (node.isVisited() == false) {
        if (node.pathIsFound()) {
          count += 1;
          node.visited = true;
          continue;
        } else {
          processNode(node, n);
          if (node.addOne.pathSum <= n) {
            nodeStack.add(node.addOne);
          }
          if (node.addTwo.pathSum <= n) {
            nodeStack.add(node.addTwo);
          }
        }
      }
    }
    return count;
  }
  public void processNode(Node node, int n) {
    node.setVisited(true);
    if (node.currPath.equals("")) {
      node.addOne = new Node(node.currPath + "1", n);
      node.addTwo = new Node(node.currPath + "2", n);
    } else {
      node.addOne = new Node(node.currPath + ":1", n);
      node.addTwo = new Node(node.currPath + ":2", n);
    }
  }
}


class Node {
  String currPath;
  Node addOne;
  Node addTwo;
  boolean visited;
  int pathSum;
  int n;

  public Node(String p, int n) {
    this.currPath = p;
    this.n = n;
   if (p.equals("")) {
     this.pathSum = 0;
   }
   else if (p.equals("1")) {
      this.pathSum = 1;
    }
   else if (p.equals("2")) {
      this.pathSum = 2;
    } else {
     this.sum(p);
   }
  }

  void sum(String path) {
    String[] pathBits = path.split(":");
    for(String s: pathBits) {
      int i = Integer.parseInt(s);
      this.pathSum += i;
    }
  }


  public String getCurrPath() {
    return currPath;
  }

  public Node getAddOne() {
    return addOne;
  }

  public Node getAddTwo() {
    return addTwo;
  }

  public boolean isVisited() {
    return visited;
  }

  public int getPathSum() {
    return pathSum;
  }

  public int getN() {
    return n;
  }

  public void setVisited(boolean visited) {
    this.visited = visited;
  }

  public boolean pathIsFound() {
    boolean res = this.n == this.pathSum;
    return res;
  }

  @Override
  public String toString() {
    return "Node{" +
            "currPath='" + currPath + '\'' +
            ", addOne=" + addOne +
            ", addTwo=" + addTwo +
            ", visited=" + visited +
            ", pathSum=" + pathSum +
            ", n=" + n +
            '}';
  }
}

