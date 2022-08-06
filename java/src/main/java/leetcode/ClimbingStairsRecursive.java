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
        processNode(node, count);
        if (node.getAddOne() != null) {
          nodeStack.add(node.getAddOne());
        }
        if (node.getAddTwo() != null) {
          nodeStack.add(node.getAddTwo());
        }
      }
    }
    return count;
  }
  public void processNode(Node node, int count) {
    node.setVisited(true);
    if (node.pathIsFound()) {
      count += 1;
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
    this.visited = false;
    this.n = n;
    this.currPath = p;
    if (currPath == "") {
      pathSum = 0;
      this.addOne = new Node("1", n);
      this.addTwo = new Node("2", n);
    } else if (currPath.equals("1")) {
      pathSum += 1;
    } else if (currPath.equals("2")) {
      pathSum += 2;
    } else {
      this.sum(this.currPath);
      if (this.pathSum <= (this.n - 2)) {
        this.addTwo = new Node(this.currPath + ":2", n);
      }
      if (this.pathSum <= (this.n - 1)) {
        this.addOne = new Node(this.currPath + ":1", n);
      }
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
    return this.n == this.pathSum;
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

