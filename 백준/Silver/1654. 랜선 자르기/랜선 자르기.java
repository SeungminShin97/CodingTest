import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long n = sc.nextLong();
        long low = 1, high = 0, mid = 0;
        long[] arr = new long[k];
        for(int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
            high = (arr[i] > high) ? arr[i] : high;
        }
        while(low <= high) {
            mid = (high + low) / 2;
            int sum = 0;
            for(int i = 0; i < k; i++) {
                sum += arr[i] / mid;
            }
            if(sum >= n) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        System.out.println(high);

        sc.close();
    }
}