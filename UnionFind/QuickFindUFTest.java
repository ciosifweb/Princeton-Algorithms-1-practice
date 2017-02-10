public class QuickFindUFTest {
  public static void main (String[] args) {

    QuickFindUF union = new QuickFindUF(10);
    union.union(1,2);
    union.union(3,2);
    union.union(6,3);
    System.out.println("Should be false: " + union.connected(7,1));
    System.out.println("Should be true: " + union.connected(1, 6));

  }
}
