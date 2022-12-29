import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) 
            cnt += sc.nextInt();
        System.out.println(cnt);
        sc.close();
    }
}