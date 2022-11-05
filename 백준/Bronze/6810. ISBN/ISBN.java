import java.util.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println(9 * 1 + 7 * 3 + 8 * 1 + 0 * 3 + 9 * 1 + 2 * 3 + 1 * 1 + 4 * 3 + 1 * 1 + 8 * 3 );
        Scanner sc = new Scanner(System.in);
        int total = 0;
        total += sc.nextInt();
        total += sc.nextInt() * 3;
        total += sc.nextInt();
        System.out.println("The 1-3-sum is " + (total + 91));
        sc.close();
    }
}