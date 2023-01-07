import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        String s = sc.next();
        for(int i = 0; i < n; i++) {
            sum += (int)s.charAt(i) - '0';
        }
        System.out.println(sum);
        sc.close();
    }
}