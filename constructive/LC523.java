package lccfcode.constructive;

import java.util.HashMap;
import java.util.Scanner;

public class LC523 {
    public static boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;

        int[] pre = new int[n + 1];
        for (int i = 1; i <= n; i++)
            pre[i] = pre[i - 1] + nums[i - 1];

        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 2; i < n; i++) {
            hash.put(pre[i - 2] % k, 1);
            if (hash.containsKey(pre[i] % k))
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        boolean res = checkSubarraySum(nums, k);
        System.out.println(res);
    }
}
