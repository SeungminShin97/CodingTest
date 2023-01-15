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
        int[][] arr  = new int[n][n];
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a - 1][b - 1] = 1;
            arr[b - 1][a - 1] = 1;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    if(arr[j][i] > 0 && arr[i][k] > 0) {
                        if(arr[j][k] == 0) 
                            arr[j][k] = arr[j][i] + arr[i][k];
                        else if(arr[j][k] > arr[j][i] + arr[i][k])
                            arr[j][k] = arr[j][i] + arr[i][k];
                    }
                }
            }
        }
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < n; j++) {
                arr[i][0] += arr[i][j];
            }
            cnt = (arr[cnt][0] > arr[i][0]) ? i : cnt; 
        }    
        System.out.println(cnt + 1);    
    }
}   