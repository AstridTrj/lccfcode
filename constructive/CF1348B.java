package lccfcode.constructive;

import java.util.HashSet;
import java.util.Scanner;

public class CF1348B {
    /**
     * 针对长度为k的区间和相同问题，可以按照以下思路考虑
     *  首先a[1]、a[2]、...、a[k]和a[2]、a[3]、...、a[k+1]和相同，则说明a[1]=a[k+1];
     *  以此类推，a[2]=a[k+2], a[3]=a[k+3], ...
     *  可以发现，存在一个周期k，每经过一个周期数字就会重复出现，因此最多只能有k个不同的数字
     *  另外，要让数组是美丽的，需要将取出的k个不同数字重复（不足k个可以添1或其它数字），至少需要重复输出n次
     *  重复n的原因是防止只有一个数且k也为1的情况，新数组中的数字需要包含原输入数组，出现次数不能少
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            HashSet<Integer> hash = new HashSet<Integer>();

            for(int i = 0; i < n; i++){
                hash.add(scanner.nextInt());
            }

            if(hash.size() > k){
                System.out.println(-1);
                continue;
            }
            System.out.println(n * k);
            for(int i = 0; i < n; i++){
                for(Integer c: hash){
                    System.out.print(c + " ");
                }
                for(int j = 0; j < k - hash.size(); j++)
                    System.out.print(1 + " ");
            }
            System.out.println();
        }
    }
}