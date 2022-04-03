import java.io.*;

public class Training16 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a = 0;
    int b = 0;
    // for (int i = 1; i <= 9; i++) {
    // System.out.println("巨人" + i + "回の表");
    // int x = Integer.parseInt(br.readLine());
    // System.out.println("阪神" + i + "回の裏");
    // int y = Integer.parseInt(br.readLine());
    // a += x;
    // b += y;
    // }
    // if (a > b) {
    // System.out.println("巨人の勝利" + a + "点");
    // } else if (a < b) {
    // System.out.println("阪神の勝利" + b + "点");
    // }

    // 入力の際に文字列を整数にしながら代入するやり方
    for (int i = 1; i <= 9; i++) {
      System.out.println("巨人" + i + "回の表");
      a += Integer.parseInt(br.readLine());
      System.out.println("阪神" + i + "回の表");
      b += Integer.parseInt(br.readLine());
      if ((a - b) >= 15) {
        break;
      } else if ((b - a) >= 15) {
        break;
      }
    }
    System.out.println("巨人" + a + "点、阪神" + b + "点");
    if (a > b) {
      System.out.println(a + "点で巨人の勝利");
    } else if (a < b) {
      System.out.println(b + "点で阪神の勝利");
    } else {
      System.out.println("引き分け");
    }
  }
}