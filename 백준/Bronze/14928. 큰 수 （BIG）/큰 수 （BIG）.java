import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            n *= 10;
            n += s.charAt(i) - '0';
            n %= 20000303;
        }
        System.out.println(n);
        sc.close();
    }
}