import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];

        int max = 0;
        for(int start = 0; start < n; start++) {
            max = Math.max(arr[start], max);
            st = new StringTokenizer(br.readLine());
            int term = Integer.parseInt(st.nextToken());
            int pay = Integer.parseInt(st.nextToken());
            int end = start + term;
            if(end > n)
                continue;
            arr[end] = Math.max(arr[end], max + pay);
        }
        max = Math.max(max, arr[n]);
        System.out.println(max);
    }
}
