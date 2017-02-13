public class QuickFindUFTest {
  public static void main (String[] args) {

    QuickFindUF union = new QuickFindUF(10);
    union.union(1,2);
    union.union(3,2);
    union.union(6,3);
    System.out.println(union.connected(6,1) + " - Should be true!");
    System.out.println(union.connected (1,7) + " - Should be false!");

  }
}
