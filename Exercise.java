import java.io.*;

public class Exercise {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));

    String s = br.readLine(); // 1行分の文字列型を入力する
    int n = Integer.parseInt(s); // 文字列型から整数型
    // System.out.println(s);
    System.out.println(n);
  }
}
