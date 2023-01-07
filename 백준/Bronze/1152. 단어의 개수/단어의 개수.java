import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String input = sc.nextLine();
        if(input.charAt(0) != ' ')
            count++;
        for(int i = 1; i < input.length(); i++){
            if(input.charAt(i) != ' ' && input.charAt(i - 1) == ' ')
                count++;
        }
        System.out.println(count);
        sc.close();
    }
}