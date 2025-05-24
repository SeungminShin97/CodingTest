import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int min = Math.min(n, m);
        if(min == 1) {
            System.out.println(1);
            return;
        }
        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            String s = br.readLine();
            for (int j = 0; j < m; j++)
                arr[i][j] = s.charAt(j);
        }

        for(int i = min - 1; i > 0; i--){
            for(int j = 0; j < n - i; j++) {
                for(int k = 0; k < m - i; k++){
                    if(arr[j][k] == arr[j + i][k]
                            && arr[j][k] == arr[j][k + i]
                            && arr[j][k] == arr[j + i][k + i]) {
                        i++;
                        System.out.println(i * i);
                        return;
                    }
                }
            }
        }
        System.out.println(1);

    }
}
