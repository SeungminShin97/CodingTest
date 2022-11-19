import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int total = 1;
        for(int i = 0; i < k; i++) 
            total *= n--;
        for(; k > 0; k--)
            total /= k;
        System.out.println(total);
        sc.close();
    }
}