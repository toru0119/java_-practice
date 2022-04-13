// public class FizzBuzz {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 100; i++) {
//             if (i % 3 == 0 && i % 5 == 0) {
//                 System.out.println("Fizz Buzz");
//             } else if (i % 3 == 0) {
//                 System.out.println("Fizz");
//             } else if (i % 5 == 0) {
//                 System.out.println("Buzz");
//             } else {
//                 System.out.println(i);
//             }
//         }
//     }
// }

public class FizzBuzz {
    public static void main(String[] args) {
        // 変数宣言
        // ループカウンタ
        int i = 0;
        // 繰返し最大数
        int loopCount = 100;
        // ３の倍数
        int numFizz = 3;
        // ５の倍数
        int numBuzz = 5;
        // Fizz文字列
        String strFizz = "Fizz";
        // Buzz文字列
        String strBuzz = "Buzz";

        for (i = 1; i <= loopCount; i++) {
            if (i % (numFizz * numBuzz) == 0) {
                System.out.println(strFizz + strBuzz);
            } else if (i % numFizz == 0) {
                System.out.println(strFizz);
            } else if (i % numBuzz == 0) {
                System.out.println(strBuzz);
            } else {
                System.out.println(i);
            }
        }
    }

}
