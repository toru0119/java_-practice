import java.io.*;

public class Training09 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));
    System.out.println("曜日を選択してください");
    System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
    int day = Integer.Int(br.readLine());

    System.out.println("時間帯を選択してください");
    System.out.println("0=午前、1=午後、2=夜間");
    int zone = Integer.parseInt(br.readLine());

    boolean x = true;

    if (day == 0) {
      x = false;
    } else if (zone == 0 && (day == 2 || day == 5)) {
      x = false;
    } else if (zone == 1 && day == 6) {
      x = false;
    } else if (zone == 2 && (day == 3 || day == 6)) {
      x = false;
    }

    if (x) {
      System.out.println("診療しています。");
    } else {
      System.out.println("休診です。");
    }
  }
}
