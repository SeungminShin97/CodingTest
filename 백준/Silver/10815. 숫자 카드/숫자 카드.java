import java.util.*;
import java.io.*;

public class Main {
    public static int arr[];
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++)
            sb.append(find(0, n - 1, Integer.parseInt(st.nextToken()))).append(" ");

        System.out.println(sb);
    }

    static int find(int start, int end, int a) {
        if(start == end)
            return (arr[start] == a) ? 1 : 0;
        if(end - start == 1) {
            if(arr[start] == a || arr[end] == a)
                return 1;
            else
                return 0;
        }
        int middle = (start + end) / 2;
        if(arr[middle] == a)
            return 1;
        else if(arr[middle] > a)
            return find(start, middle, a);
        else
            return find(middle + 1, end, a);
    }
}