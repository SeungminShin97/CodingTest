import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = i;
        }
        Arrays.sort(arr, ((o1, o2) -> o1[0] - o2[0]));
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(map.get(arr[i][0]) == null) {
                map.put(arr[i][0], cnt);
                cnt++;
            }
        }
        Arrays.sort(arr, ((o1, o2) -> o1[1] - o2[1]));
        for(int i = 0; i < n; i++) 
            sb.append(map.get(arr[i][0]) + " ");
        System.out.println(sb);
    }
}