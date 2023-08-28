package lccfcode.constructive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CF1339B {
    /**
     * 思考：1. 如何保证两两差值绝对值逐渐增大？
     *      2. 为了满足题意，贪心的取数组中的最大x和最小y，那它们的差值应该是目前最大的，把它们最为重排后的最后两个元素。
     *      3. 假设选取的最大最小，在新数组中顺序为 y x，那此时需要在剩下的元素中找离y距离最大的，那显然是剩下的元素的最大值
     *      4. 依次选择，则可以得到一个满足题意的序列
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            Arrays.sort(a);
            List<Integer> res = new ArrayList<>();
            for(int i = 0, j = n - 1; i <= j; i++, j--){
                if(i != j){
                    res.add(a[j]);
                    res.add(a[i]);
                }else {
                    res.add(a[i]);
                }
            }

            for (int i = n - 1; i >= 0; i--) {
                System.out.print(res.get(i) + " ");
            }
            System.out.println();
        }
    }
}