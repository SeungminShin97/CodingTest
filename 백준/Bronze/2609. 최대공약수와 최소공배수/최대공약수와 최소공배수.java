import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int high = (a > b) ? a : b;
        int low = (a > b) ? b : a;
        while(high % low != 0) {
            high %= low;
            int temp = high;
            high = low;
            low = temp;
        }
        System.out.println(low);
        System.out.println(a * b / low);
        sc.close();
    }
}