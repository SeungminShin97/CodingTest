import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long high = (long) 0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            arr[i] = input;
            high = (high > input) ? high : input;
        }
        long low = 0, mid = 0;
        while(low < high) {
            mid = (high + low) / 2;
            long total = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] > mid)
                    total += arr[i] - mid;
            }
            if(total > m) 
                low = mid + 1;
            else if(total == m) {
                System.out.println(mid);
                System.exit(0);
            }
            else 
                high = mid;
        }
        System.out.println(high - 1);
    }
}