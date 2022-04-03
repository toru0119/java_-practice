import java.io.*;

public class Training17 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = 0;
    int y = 0;
    System.out.println("数字を10回入力してください");
    for (int i = 1; i <= 10; i++) {
      int z = Integer.parseInt(br.readLine());
      if (x < z) {
        x = z;
      } else if (y > z) {
        y = z;
      }
    }
    System.out.println("最小値は" + x);
    System.out.println("最大値は" + y);
  }
}
