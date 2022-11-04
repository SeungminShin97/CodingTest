import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int high = 0;
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr[i] = num;
            high = (high > num) ? high : num;
        }
        int[] higharr = new int[high];
        higharr[0] = 1;
        int start = 2;
        while((start * start) <= high) {
            int one = start * 2;
            while(one <= high) {
                higharr[one - 1] = 1;
                one += start;
            }
            start++;
            while(higharr[start - 1] == 1)
                start++;
        }
        int cnt = 0;
        for(int i : arr) {
            if(higharr[i - 1] == 0)
                cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}