package lccfcode.constructive;

import java.util.Scanner;

public class CF1497C1 {
    /**
     * 思考：题目要求最小公倍数不能超过n/2，且k为3，那么就尝试设置为n/2。
     *  进一步，此时需要区分n为奇数还是偶数？
     *  如果为奇数，那么容易知道n/2，n/2，1就是符合题目的解
     *  如果为偶数，初步可以想到和奇数情况相同的方案: n/2-1, n/2-1,2
     *      提交后会发现当n为8,12,16...时不能通过，此时继续分析n为4的倍数（n/2的奇偶情况）的情况
     *      如果不是4的倍数，则采用方案n/2-1, n/2-1,2
     *      如果是4的倍数，要满足最大公倍数为n/2，那么可以先设置一项n/2，再设置剩下两项为n/4
     *  另外，还需要思考如果不是n/2呢，设置为n/3如何？继续分析可以发现不能满足题意
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            if(n % 2 == 1){
                System.out.println(n / 2 + " " + n / 2 + " " + 1);
            }else{
                if(n % 4 != 0){
                    System.out.println((n / 2 - 1) + " " + (n / 2 - 1) + " " + 2);
                }else{
                    System.out.println(n / 2 + " " + n / 4 + " " + n / 4);
                }
            }
        }
    }
}
