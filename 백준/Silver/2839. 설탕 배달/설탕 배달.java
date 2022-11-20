import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int mul = n / 5; 
        for(int i = 0; i < (n / 5) + 1; i++) {
            if((n - (mul * 5)) % 3 == 0) {
                cnt += (mul + ((n - (mul * 5)) / 3));
                break;
            } 
            else    
                mul--;
        }
        if(cnt == 0)
            System.out.println(-1);
        else
            System.out.println(cnt);
        sc.close();
    }
}