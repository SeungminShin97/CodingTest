import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = 0, m = 0;
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            int pay = sc.nextInt();
            y += ((pay / 30) + 1) * 10;
            m += ((pay / 60) + 1) * 15;
        }
        if(y > m)
            System.out.println("M " + m);
        else if(y < m)
            System.out.println("Y " + y);
        else
            System.out.println("Y M " + m);
        sc.close();
    }
}
