package lccfcode.constructive;

import java.util.Scanner;

public class CF1365B {
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