import java.io.*;

public class Training18 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("数字を入力");
    int a = Integer.parseInt(br.readLine());
    // for (int i = 1; i <= a; i++) {
    // System.out.print("*");
    // }
    while (0 < a) {
      System.out.print("*");
      a--;
    }
  }
}
