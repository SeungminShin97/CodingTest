import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        ArrayList<Integer> list[];
        int color[][];

        for(int i = 0; i < 10; i++) {
            sb.append("#").append(i + 1).append(" ");
            br.readLine();

            int sum = 0;
            color = new int[100][2];
            list = new ArrayList[100];
            for(int j = 0; j < 100; j++)
                list[j] = new ArrayList<>();

            for(int j = 0; j < 100; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < 100; k++) {
                    int input = Integer.parseInt(st.nextToken());
                    if(input == 0)
                        continue;
                    if(input == 1 || !list[k].isEmpty())
                        list[k].add(input);
                    if(!list[k].isEmpty()) {
                        if(color[k][0] == 0)
                            color[k][0] = input;
                        else {
                            if(color[k][0] != input) {
                                color[k][0] = input;
                                if(input == 2)
                                    color[k][1]++;
                            }
                        }
                    }
                }
            }

            for(int j = 0; j < 100; j++)
                sum += color[j][1];

            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }

}   
