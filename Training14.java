import java.io.*;

public class Training14 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = 0;
    int i = 1;
    System.out.println("10回入力");
    for (i = 1; i <= 10; i++) {
      int n = Integer.parseInt(br.readLine());
      x += n;
    }
    System.out.println(x / i);
  }
}
