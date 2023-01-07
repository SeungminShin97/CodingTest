import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x1 = (x > (w - x) ? w - x : x);
        int y1 = (y > (h - y) ? h - y : y);
        System.out.println((x1 > y1) ? y1 : x1);
        sc.close();
    }
}