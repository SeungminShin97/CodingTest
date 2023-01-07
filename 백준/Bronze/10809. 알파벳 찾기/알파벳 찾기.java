import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[26];
        Arrays.fill(arr,-1);
        for(int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - 'a';
            if(arr[a] == -1) 
                arr[a] = i;
        }
        for(int i : arr) 
            System.out.print(i + " ");
        sc.close();
    }
}