package UnionFind;

public class QuickFindUF {
  private int[] ids;

  public QuickFindUF(int size) {
    ids = new int[size];
    for (int i = 0; i < size; i++) {
      ids[i] = i;
    }
  }

  public boolean connected (int p, int q) {
    return ids[p] == ids[q];
  }

  public void union (int p, int q) {
    if (connected(p, q)) return;

    for (int i = 0; i < ids.length; i++) {
      if (ids[i] == ids[q]) {
        ids[i] = ids[p];
      }
    }
  }

}
