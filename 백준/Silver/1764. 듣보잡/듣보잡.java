import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static int point = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        ArrayList<String> arr = new ArrayList<>();  
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> hash = new HashMap<>();
        int cnt = 0;
        for(int i = 0; i < n; i++) 
            hash.put(br.readLine(), 0);
        for(int i = 0; i < m; i++) {
            String s = br.readLine();
            if(hash.get(s) != null) {
                cnt++;
                arr.add(s);
            }
        }
        Collections.sort(arr);
        System.out.println(cnt);
        for(String s : arr)
            System.out.println(s);
    }
}
