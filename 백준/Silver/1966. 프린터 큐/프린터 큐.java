import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        int arr[] = new int[9];
        int input = sc.nextInt();
        for(int i = 0; i < input; i++) {
            int high = 0;
            int count = 0;
            int n = sc.nextInt();
            int m = sc.nextInt();
            for(int j = 0; j < n; j++) {
                int num = sc.nextInt();
                high = (high > num) ? high : num;
                queue.add(num);
                arr[num - 1]++;
            }
            while(true) {
                if(queue.peek() == high) {
                    queue.poll();
                    n--;
                    count++;
                    if(m == 0)
                        break;
                    else 
                        m = (m == 0) ? n - 1 : m - 1;
                    arr[high - 1]--;
                    if(arr[high - 1] == 0 && high >= 1) {
                        while(arr[high - 1] == 0)
                            high--;
                    }
                } else {
                    queue.add(queue.peek());
                    queue.poll();
                    m = (m == 0) ? n - 1 : m - 1;
                }
            }
            System.out.println(count);
            queue.clear();
            Arrays.fill(arr, 0);
        }
        sc.close();
    }
}