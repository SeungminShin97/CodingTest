import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        long mul = a * b * c;
        int[] arr = new int[10];
        while (mul > 10) {
            arr[(int) (mul % 10)] ++;
            mul /= 10;
        }
        arr[(int) (mul % 10)]++;
        for(int i : arr) 
            System.out.println(i);
        sc.close();
    }
}