import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        if(n == 1) {
            System.out.println(-1);
            return;
        }

        boolean[] arr = new boolean[n + 1];
        arr[0] = true;
        arr[1] = true;
        int limit = (int) Math.sqrt(n) + 1;
        for(int i = 2; i <= limit; i++) {
            if(!arr[i]) {
                int count = 2;
                while(i * count <= n) {
                    arr[i * count] = true;
                    count++;
                }
            }
        }

        int sum = 0;
        int min = 0;
        for(int i = m; i <= n; i++) {
            if(!arr[i]) {
                sum += i;
                if(min == 0)
                    min = i;
            }
        }

        if(sum == 0)
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
