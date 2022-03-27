public class Training06 {
  public static void main(String[] agre) {
    int x = 0;
    if (x % 2 == 0) {
      System.out.println(x + "は偶数");
    } else if (x % 2 == 1) {
      System.out.println(x + "は奇数");
    } else if ((x < 0) && (x % 2 == 0)) {
      System.out.println(x + "は負の偶数");
    } else if ((x < 0) && (x % 2 == -1)) {
      System.out.println(x + "は負の奇数");
    }

    if (x % 2 == 0) {
      if (x >= 0) {
        System.out.println("正の偶数");
      } else {
        System.out.println("負の偶数");
      }
    } else {
      if (x >= 0) {
        System.out.println("正の奇数");
      } else {
        System.out.println("負の奇数");
      }
    }
  }
}
