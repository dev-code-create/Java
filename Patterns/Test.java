package Patterns;

public class Test {
  int x = 10;

  public static void main(String[] args) {
    char c1 = '*';
    for (int i = 0; i < 4; i++) {
      for (int j = 1; j <= i + 1; j++) {
        System.out.print(c1);
      }
      System.out.println();
    }
  }
}