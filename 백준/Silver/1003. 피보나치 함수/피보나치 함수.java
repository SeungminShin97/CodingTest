import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0)
                sb.append("1 0\n");
            else if(n == 1)
                sb.append("0 1\n");
            else {
                int[] arr = new int[n + 1];
                arr[n] = 1;
                for(int j = n; j > 1; j--) {
                    arr[j - 1] += arr[j];
                    arr[j - 2] += arr[j];
                }
                sb.append(arr[0] + " " + arr[1] + "\n");
            }
        }
        System.out.println(sb);
    }
}