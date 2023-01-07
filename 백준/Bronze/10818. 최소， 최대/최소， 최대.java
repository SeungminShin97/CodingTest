import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, min; 
        int n = sc.nextInt();
        int a = sc.nextInt();
        max = a;
        min = a;
        for(int i = 1; i < n; i++) {
            int b = sc.nextInt();
            max = (max > b) ? max : b;
            min = (b > min) ? min : b;
        }
        System.out.print(min + " " + max);
        sc.close();
    }
}