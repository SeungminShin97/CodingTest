import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int[] arr = new int[9];
        for(int i = 0 ; i < 9 ; i++) { 
            arr[i] = sc.nextInt();
            n = (arr[i] > arr[n]) ? i : n;
        }
        System.out.println(arr[n]);
        System.out.println(n+1);
        sc.close();
    }
}