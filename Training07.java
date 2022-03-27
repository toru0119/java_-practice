public class Training07 {
  public static void main(String[] args) {
    int x = 80;
    if (x >= 60) {
      System.out.println("合格");
    } else {
      System.out.println("不合格");
    }
    if (x >= 80) {
      System.out.println("大変よくできました");
    } else if (x >= 60) {
      System.out.println("よくできました");
    } else {
      System.out.println("残念");
    }
    if (x >= 80) {
      System.out.println("優");
    } else if (x >= 70) {
      System.out.println("良");
    } else if (x >= 60) {
      System.out.println("可");
    } else {
      System.out.println("不可");
    }
  }
}
