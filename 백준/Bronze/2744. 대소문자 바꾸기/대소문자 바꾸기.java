import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String output = "";
        for(int i = 0; i < a.length(); ++i){
            if(Character.isUpperCase(a.charAt(i)))
                output += Character.toLowerCase(a.charAt(i));
            else if(Character.isLowerCase(a.charAt(i)))
                output += Character.toUpperCase(a.charAt(i));
            else 
                output += a.charAt(i);
        }
        System.out.println(output);
        sc.close();
    }
}