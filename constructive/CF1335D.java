package lccfcode.constructive;

import java.util.Scanner;

public class CF1335D {

    public static void main(String[] args) {
        // 考虑原数独的特性，已经保证每行每列每个块都只有1-9的一个数字
        // 那么如果将每行每列每个块的某个数字缓存另一个，则满足了题意
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        while (t-- > 0) {
            String[] s = new String[9];
            for (int i = 0; i < 9; i++) {
                s[i] = scanner.nextLine();
                s[i] = s[i].replace("3", "5");
            }

            for (int i = 0; i < 9; i++) {
                System.out.println(s[i]);
            }
        }
    }
}
