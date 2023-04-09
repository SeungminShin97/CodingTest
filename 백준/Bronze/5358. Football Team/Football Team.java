import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = "";
        while((s = br.readLine()) != null) {
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'i')
                    sb.append("e");
                else if(s.charAt(i) == 'e')
                    sb.append("i");
                else if(s.charAt(i) == 'I')
                    sb.append("E");
                else if(s.charAt(i) == 'E')
                    sb.append("I");
                else
                    sb.append(s.charAt(i));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}