package Tester;

import java.util.ArrayList;

public abstract class AbstractTest {
  private static int numberOfAssertions = 0;
  private static int failedAssertions = 0;
  private static ArrayList<String> errors = new ArrayList<>();

  public static void assertEquals(int a, int b, String message) {
    numberOfAssertions++;
    if (a != b) {
      failedAssertions++;
      errors.add(message);
    }
  }

  public static void assertTrue(boolean a, String message) {
    numberOfAssertions++;
    if (a == false) {
      failedAssertions++;
      errors.add(message);
    }
  }

  public static void assertFalse(boolean a, String message) {
    numberOfAssertions++;
    if (a == false) {
      failedAssertions++;
      errors.add(message);
    }
  }

  public static void getStatus() {
    if (numberOfAssertions == 0) {
      System.out.println("No tests ran!");
    } else if (numberOfAssertions > 0 && failedAssertions == 0) {
      System.out.println(numberOfAssertions + " tests completed successfully! No failures!");
    } else {
      int okAssertions = numberOfAssertions - failedAssertions;
      System.out.println(numberOfAssertions + " tests ran: \n" + okAssertions + " tests passed, \n" + failedAssertions + "  tests failed: \n");
      int testCount = 0;
      for (String message : errors) {
        testCount++;
        System.out.println("Test No. " + testCount + " failed with: " + message);
      }
    }
  }
}
