import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        for(int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            n += (a * a);
        }
        System.out.println(n % 10);
        sc.close();
    }
}