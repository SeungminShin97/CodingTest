import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            if(i == 0) {
                arr.add(s);
                s = null;
            }
            else {
                for(int j = 0; j < arr.size(); j++) {
                    if(arr.get(j).equals(s)) {
                        s = null;
                        break;
                    }
                    else if(arr.get(j).length() > s.length()) {
                        arr.add(j,s);
                        s = null;
                        break;
                    } else if(arr.get(j).length() == s.length()) {
                        for(int k = 0; k < s.length(); k++) {
                            if(arr.get(j).charAt(k) > s.charAt(k)) {
                                arr.add(j,s);
                                j = arr.size();
                                s = null;
                                break;
                            } else if(arr.get(j).charAt(k) < s.charAt(k))
                                break;
                        }
                    }
                }
                if(s != null)
                    arr.add(s);
            }
        }
        for(int i = 0 ; i < arr.size(); i++)
            System.out.println(arr.get(i));
        sc.close();
    }
}