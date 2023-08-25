package lccfcode.constructive;

import java.util.Scanner;

public class CF1352B {

    public static void main(String[] args) {
        // 由于需要全为奇数或者全为偶数，那么可以分别考虑
        // 全为奇数：此时可以考虑是否能固定部分位置，将整体的拆分问题转化为单个数字的判断问题
        //         于是可以考虑先固定k-1个1（选择奇数时，每个位置至少为1），然后判断最后一个数的奇偶情况
        // 偶数同理。
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {

            int n = scanner.nextInt();
            int k = scanner.nextInt();

            if (n - k + 1 > 0 && (n - k + 1) % 2 == 1) {
                System.out.println("YES");
                for (int i = 0; i < k - 1; i++)
                    System.out.print(1 + " ");
                System.out.println(n - k + 1);
            } else if (n - 2 * k + 2 > 0 && (n - 2 * k + 2) % 2 == 0) {
                System.out.println("YES");
                for (int i = 0; i < k - 1; i++)
                    System.out.print(2 + " ");
                System.out.println(n - 2 * k + 2);
            } else {
                System.out.println("NO");
            }
        }
    }
}
