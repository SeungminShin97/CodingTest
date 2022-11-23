import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] sort = new int[257][2];
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i <= 256; i++) {
            int push = 0, pop = 0;
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < m; k++) {
                    if(i > arr[j][k])
                        push += i - arr[j][k];
                    else
                        pop += arr[j][k] - i;
                }
            }
            if(push > (pop + b)) {
                sort[i][0] = i;
                sort[i][1] = 999999999;
            }
            else {
                sort[i][0] = i;
                sort[i][1] = (pop * 2) + push;
            }
        }
        Arrays.sort(sort, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1])
                    return o2[0] - o1[0];
                return o1[1] - o2[1];
            }
        });
        System.out.println(sort[0][1] + " " + sort[0][0]);
    }
}