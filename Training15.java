import java.io.*;

public class Training15 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("10回、0と2を入力");
    int y = 0;
    for (int i = 1; i <= 10; i++) {
      int x = Integer.parseInt(br.readLine());
      if (x == 1) {
        y += 1;
      }
    }
    System.out.println("勝ち数" + y);
    System.out.println("負数" + (10 - y));
  }
}
