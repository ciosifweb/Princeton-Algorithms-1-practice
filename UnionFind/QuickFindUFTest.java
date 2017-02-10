package UnionFind;

import Tester.AbstractTest;

public class QuickFindUFTest extends AbstractTest {
  public static void main (String[] args) {

    QuickFindUF union = new QuickFindUF(10);
    union.union(1,2);
    union.union(3,2);
    union.union(6,3);
    assertFalse(union.connected(7,1), "1 should not be connected to 7");
    assertTrue(union.connected(1, 6), "1 should be connected to 6");
    getStatus();

  }
}
