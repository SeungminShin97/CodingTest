import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, cnt = 0;
        while(temp > 0){
            cnt += 9;
            temp /= 10;
        }
        cnt = n - cnt;
        while(cnt < n) {
            int asdf = cnt;
            temp = 0;
            while(asdf > 0) {
                temp += asdf % 10;
                asdf /= 10;
            }
            if(n - cnt == temp) {
                System.out.println(cnt);
                System.exit(0);
            }
            else    
                cnt++;
        }
        System.out.println(0);
        sc.close();
    }
}