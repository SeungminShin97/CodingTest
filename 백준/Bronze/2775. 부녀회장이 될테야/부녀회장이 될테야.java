import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc. nextInt();
        int k, n;
        int[][] arr;
        for(int i = 0; i < t; i++) {
            k = sc.nextInt();
            n = sc.nextInt();
            arr = new int[k][n];
            for(int j = 0; j < k; j++) {
                for(int l = 0; l < n; l++) {
                    if(j == 0)
                        arr[j][l] = l + 1;
                    else {
                        int sum = 0;
                        for(int m = 0; m <= l; m++) {
                            sum += arr[j - 1][m];
                        }
                        arr[j][l] = sum;
                    }
                }
            }
            int total = 0;
            for(int j = 0; j < n; j++) {
                total += arr[k - 1][j];
            }
            System.out.println(total);
        }
        sc.close();
    }
}