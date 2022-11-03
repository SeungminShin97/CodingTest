import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        System.out.println((l % 5 == 0) ? l / 5 : (l / 5) + 1);
        sc.close();
    }
}