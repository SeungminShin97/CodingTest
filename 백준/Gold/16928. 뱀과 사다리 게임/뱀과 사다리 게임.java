import java.io.*;
import java.util.*;

class node {
    int num;
    int cnt;
    node(int num, int cnt) {
        this.num = num;
        this.cnt = cnt;
    }
}

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[100][2];
        for(int i = 0; i < n + m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a - 1][0] = b - 1;
        }
        Queue<node> q = new LinkedList<>();
        q.add(new node(0, 0));
        while(true) {
            int pnum = q.peek().num;
            int pcnt = q.peek().cnt;
            if(pnum == 99) 
                break;
            if(arr[pnum][1] == 0 || pcnt <= arr[pnum][1]) {
                int j = (pnum >= 94) ? 99 - pnum : 6;
                for(int i = 1; i <= j; i++) {
                    if(arr[pnum + i][0] == 0) {
                        if(arr[pnum + i][1] == 0 || arr[pnum + i][1] > pcnt) {
                            q.add(new node(pnum + i, pcnt + 1));
                            arr[pnum + i][1] = pcnt + 1;
                        }
                    }
                    else  {
                        if(arr[pnum + i][1] == 0 || arr[pnum + i][1] > pcnt) {
                            q.add(new node(arr[pnum + i][0], pcnt + 1));
                            arr[pnum + i][1] = pcnt + 1;
                        }
                    }
                }
            }
            q.poll();
        }
        System.out.println(q.peek().cnt);
        q.clear();
    }
}