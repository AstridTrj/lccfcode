package lccfcode.constructive;

import java.util.Scanner;

public class CF478B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();

        long a = n / m;
        long b = n % m;

        long min = (m - b) * a * (a - 1) / 2 + b * (a + 1) * a / 2;
        long max = (n - m + 1) * (n - m) / 2;

        System.out.println(min + " " + max);
    }
}
