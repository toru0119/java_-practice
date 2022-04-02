public class Training13 {
  public static void main(String[] args) {
    // for (int i = 1, x = 1; i <= 7; i++, x *= i) {
    // System.out.println(x);
    // }
    int x = 1;
    for (int i = 1; i <= 7; i++) {
      x *= i;
    }
    System.out.println(x);
  }
}
// for文からxを外さないとfor文の外でアウトプットできない
