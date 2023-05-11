
public class Sliding {
    public static int xSum(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = { 16, 12, 9, 19, 11, 8 };
        System.out.println((xSum(arr, k)));
    }

}
