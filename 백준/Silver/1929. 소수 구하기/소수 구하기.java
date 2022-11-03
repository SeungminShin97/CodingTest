import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        arr[0] = 1;
        int start = 2;
        while((start * start) <= n) {
            int point = start * 2;
            while(point <= n) {
                arr[point - 1] = 1;
                point += start;
            }
            start++;
            while(arr[start] == 0)
                start++;
        }
        for(int i = m - 1; i < n; i++) {
            if(arr[i] == 0)
                System.out.println(i + 1);
        }
        sc.close();
    }
}