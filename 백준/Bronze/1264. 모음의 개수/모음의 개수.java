import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine().toLowerCase();
        while(!s.equals("#")) {
            int cnt = 0;
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    cnt++;
            }
            sb.append(cnt + "\n");
            s = br.readLine().toLowerCase();
        }
        System.out.println(sb);
    }
}