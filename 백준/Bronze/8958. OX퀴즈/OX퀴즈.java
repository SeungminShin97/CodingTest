import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        String arr[] = new String[n];
        for(int i = 0; i < n; i++) 
            arr[i] = sc.nextLine();
        for(int i = 0; i < n; i++) 
            System.out.println(print(arr[i]));
        sc.close();
    }
    public static int print(String s) {
        int n = 0, score = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'O') {
                n++;
                score += n;
            } else if (s.charAt(i) == 'X') 
                n = 0;
        }
        return score;
    }
}