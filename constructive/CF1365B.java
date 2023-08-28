package lccfcode.constructive;

import java.util.Scanner;

public class CF1365B {
    /**
     * 思考：1。根据交换的原理，只要有一个中间量，就能完成两个变量的交换，此题中则体现为中间量和两个变量保持不同类型
     *      2. 继续思考，也就是只要有0且有1就可以完成题意
     *      3. 考虑只有0或者只有1的情况，那需要看整体是否有序
     *      4. 如果都不满足，则无法交换
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            boolean hasZero = false, hasOne = false, notSorted = false;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                if(i > 0 && a[i - 1] > a[i])
                    notSorted = true;
            }
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
                if(b[i] == 0)
                    hasZero = true;
                else if (b[i] == 1)
                    hasOne = true;
            }

            if(!notSorted){
                System.out.println("Yes");
            } else if (hasZero && hasOne) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}