import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int point = 0;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[100001][2];
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        while(true) {
            if(q.peek() == k) 
                break;
            else {
                if(q.peek() - 1 >= 0 && arr[q.peek() - 1][0] == 0) {
                    q.add(q.peek() - 1);
                    arr[q.peek() - 1][0] = 1;
                    arr[q.peek() - 1][1] = arr[q.peek()][1] + 1;
                }
                if(q.peek() + 1 <= 100000 && arr[q.peek() + 1][0] == 0) {
                    q.add(q.peek() + 1);
                    arr[q.peek() + 1][0] = 1;
                    arr[q.peek() + 1][1] = arr[q.peek()][1] + 1;
                }
                if(q.peek() * 2 <= 100000 && arr[q.peek() * 2][0] == 0) {
                    q.add(q.peek() * 2);
                    arr[q.peek() * 2][0] = 1;
                    arr[q.peek() * 2][1] = arr[q.peek()][1] + 1;
                }
                q.poll();
            }
        }
        System.out.println(arr[k][1]);
        sc.close();
    }
}
