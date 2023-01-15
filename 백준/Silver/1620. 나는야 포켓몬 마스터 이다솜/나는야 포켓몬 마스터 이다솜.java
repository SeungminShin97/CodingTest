import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, String> hash = new HashMap<>();
        HashMap<String, Integer> hash1 = new HashMap<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i = 1; i <= n; i++) {
            String s = br.readLine();
            hash.put(i,s);
            hash1.put(s, i);
        }
        for(int i = 1; i <= m; i++) {
            String s = br.readLine();
            if(Character.isDigit(s.charAt(0)))
                sb.append(hash.get(Integer.parseInt(s)) + "\n");
            else {
                sb.append(hash1.get(s) + "\n");
            }
        }
        System.out.println(sb);
    }
}