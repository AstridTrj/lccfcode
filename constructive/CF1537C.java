package lccfcode.constructive;

import java.util.Arrays;
import java.util.Scanner;

public class CF1537C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();;
        while(t-- > 0){
            int n = scanner.nextInt();
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = scanner.nextInt();
            }
            Arrays.sort(num);
            if(n <= 2){
                for(int i = 0; i < n; i++)
                    System.out.print(num[i] + " ");
                System.out.println();
            }else{
                int idx = -1, minV = (int)3e9;
                for (int i = 1; i < n; i++) {
                    int absed = Math.abs(num[i] - num[i - 1]);
                    if(absed < minV){
                        idx = i;
                        minV = absed;
                    }
                }

                for(int i = idx; i < n; i++)
                    System.out.print(num[i] + " ");
                for(int i = 0; i < idx; i++)
                    System.out.print(num[i] + " ");
                System.out.println();
            }
        }
    }
}
