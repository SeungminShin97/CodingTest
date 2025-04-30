import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        if(n == 1) {
            br.readLine();
            System.out.println("1");
            return;
        }

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int max = 0;

        for(int i = 0; i < n - 1;) {
            int pair = 0;
            int pairPoint = 0;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] != arr[i]) {
                    if(pair == 0) {
                        pair = arr[j];
                        pairPoint = j;
                    } else if(arr[j] != pair) {
                        max = Math.max(j - i, max);
                        if(arr[j - 1] == arr[i])
                            i = j - 1;
                        else
                            i = pairPoint;
                        break;
                    }
                }
                if(j == n - 1) {
                    max = Math.max(max, j - i + 1);
                    i = n;
                }
            }
        }
        System.out.println(max);
    }
}
