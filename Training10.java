import java.io.*;

public class Training10 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    System.out.println("入力されたのは" + s);
    for (int i = 1; i <= 10; i += 1) {
      System.out.println(s);
    }
  }
}
// 文字型、出力がそのまま文字型なので文字型のまま