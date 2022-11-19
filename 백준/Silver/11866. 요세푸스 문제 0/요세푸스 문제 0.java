import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int jump = k;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) 
            arr[i] = i + 1;
        sb.append("<");
        for(int i = 0; i < n - 1; i++) {
            sb.append(arr[jump - 1] + ", ");
            arr[jump - 1] = 0;
            for(int j = 0; j < k; j++) {
                jump++;
                while(true) {
                    if(jump <= n && arr[jump - 1] != 0)
                        break;
                    if(jump > n)
                        jump -= n;
                    if(arr[jump - 1] == 0)
                        jump++;
                }
            }
        }
        sb.append(arr[jump - 1] + ">");
        System.out.println(sb);
        sc.close();
    }
}