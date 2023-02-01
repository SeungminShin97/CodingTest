import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sum = 0;
        if(s.length() == 1) {
            sum = Integer.parseInt(s);
            System.out.println(0);
            System.out.println((sum % 3 == 0) ? "YES" : "NO");
            System.exit(0);
        }
        else {
            for(int i = 0; i < s.length(); i++) 
                sum += s.charAt(i) - '0';
            int cnt = 1;
            while(sum >= 10) {
                int n = 0;
                for(int i = sum; i > 0; i /= 10) 
                    n += i % 10;
                sum = n;
                cnt++;
            }
            System.out.println(cnt);
            System.out.println((sum % 3 == 0) ? "YES" : "NO");
        }
    }
}
