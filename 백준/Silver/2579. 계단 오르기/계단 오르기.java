import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stair = new int[n];
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }
        arr[0] = stair[0];
        if(n == 1) {
            System.out.println(arr[0]);
            System.exit(0);
        }
        arr[1] = stair[0] + stair[1];
        if(n == 2) {
            System.out.println(arr[1]);
            System.exit(0);
        }
        arr[2] = max((stair[0] + stair[2]), (stair[1] + stair[2]));
        if(n == 3) {
            System.out.println(arr[2]);
            System.exit(0);
        }
        for(int i = 3; i < n; i++) 
            arr[i] = max((arr[i - 2] + stair[i]), (arr[i - 3] + stair[i - 1] + stair[i]));
        System.out.println(arr[n - 1]);
    }
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}