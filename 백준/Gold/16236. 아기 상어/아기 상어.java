import java.io.*;
import java.util.*;

class node {
    int x;
    int y;
    int time;
    int timelocate;
    node(int x, int y, int time, int timelocate) {
        this.x = x;
        this.y = y;
        this.time = time;
        this.timelocate = timelocate;
    }
}

public class Main {
    public static int xfish;
    public static int yfish;
    public static int fishSize = 2;
    public static int fishEatCnt = 0;
    public static Queue<node> q;
    public static Queue<node> q2;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        int[][][] arr = new int[n][n][2];
        int[] size = new int[6];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                int input = Integer.parseInt(st.nextToken());
                arr[i][j][0] = input;
                if(input == 9) {
                    q.add(new node(j, i, 0, 1));
                    arr[i][j][0] = 0;
                    arr[i][j][1] = 1;
                    xfish = j;
                    yfish = i;
                }
                else if(input > 0) 
                    size[input - 1] += 1;
            }
        }
        int output = 0;
        q2 = new LinkedList<>();
        while(caneat(size, fishSize) && !q.isEmpty()) {
            int x = q.peek().x;
            int y = q.peek().y;
            int time = q.peek().time;
            int timelocate = q.peek().timelocate;
            if(y > 0 && arr[y - 1][x][0] <= fishSize && arr[y - 1][x][1] != timelocate) {       // 위쪽
                arr[y - 1][x][1] = timelocate;
                q.add(new node(x, y - 1, time + 1, timelocate));
                if(arr[y - 1][x][0] > 0 && arr[y - 1][x][0] < fishSize) 
                    q2.add(new node(x, y - 1, time + 1, timelocate));
            }
            if(x > 0 && arr[y][x - 1][0] <= fishSize && arr[y][x - 1][1] != timelocate) {       // 왼쪽
                arr[y][x - 1][1] = timelocate;
                q.add(new node(x - 1, y, time + 1, timelocate));
                if(arr[y][x - 1][0] > 0 && arr[y][x - 1][0] < fishSize)
                    q2.add(new node(x - 1, y, time + 1, timelocate));
            }
            if(x < n - 1 && arr[y][x + 1][0] <= fishSize && arr[y][x + 1][1] != timelocate) {   // 오른쪽
                arr[y][x + 1][1] = timelocate;
                q.add(new node(x + 1, y, time + 1, timelocate));
                if(arr[y][x + 1][0] > 0 && arr[y][x + 1][0] < fishSize)
                    q2.add(new node(x + 1, y, time + 1, timelocate));
            }
            if(y < n - 1 && arr[y + 1][x][0] <= fishSize && arr[y + 1][x][1] != timelocate) {   // 아래
                arr[y + 1][x][1] = timelocate;
                q.add(new node(x, y + 1, time + 1, timelocate));
                if(arr[y + 1][x][0] > 0 && arr[y + 1][x][0] < fishSize)
                    q2.add(new node(x, y + 1, time + 1, timelocate));
            }
            if(q.size() == 1) {
                if(q2.isEmpty())
                    break;
                int nx = q2.peek().x;
                int ny = q2.peek().y;
                int ntime = q2.peek().time;
                int ntimelocate = q2.peek().timelocate;
                if(q2.size() > 1) {
                    while(!q2.isEmpty()) {
                        int mx = q2.peek().x;
                        int my = q2.peek().y;
                        int mtime = q2.peek().time;
                        if(ntime == mtime) {
                            if(ny == my) {
                                if(nx > mx) {
                                    nx = mx;
                                    ny = my;
                                    ntime = mtime;
                                    ntime = q2.peek().time;
                                    ntimelocate = q2.peek().timelocate;
                                }
                            }
                            else if(ny > my) {
                                nx = mx;
                                ny = my;
                                ntime = mtime;
                                ntime = q2.peek().time;
                                ntimelocate = q2.peek().timelocate;
                            }
                        } 
                        else if(ntime > mtime) {
                            nx = mx;
                            ny = my;
                            ntime = mtime;
                            ntime = q2.peek().time;
                            ntimelocate = q2.peek().timelocate;
                        }
                        q2.poll();
                    }
                }
                q2.clear();
                q.add(new node(nx, ny, ntime, ntimelocate + 1));
                xfish = nx;
                yfish = ny;
                output = ntime;
                eat();
                size[arr[yfish][xfish][0] - 1]--;
                arr[yfish][xfish][0] = 0;
            }
            q.poll();
        }
        System.out.println(output);
    }

    public static void eat() {
        fishEatCnt++;
        if(fishEatCnt == fishSize) {
            fishSize++;
            fishEatCnt = 0;
        }
    }

    public static boolean caneat(int[] size, int fishsize) {
        int cnt = 0;
        if(fishsize > 7)
            fishsize = 7;
        for(int i = 0; i < fishsize - 1; i++)
            cnt += size[i];
        if(cnt > 0)
            return true;
        else
            return false;
    }

}