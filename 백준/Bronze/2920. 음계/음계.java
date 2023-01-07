import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        int n = 0;
        for(int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
            if(i > 0) {
                if(arr[i] == arr[i - 1] + 1)
                    n++;
                else if(arr[i] == arr[i - 1] - 1)
                    n--;
            } 
        }
        String s;
        s = (n == 7) ? "ascending" : ((n == -7) ? "descending" : "mixed");
        System.out.println(s);
        sc.close();
    }
}