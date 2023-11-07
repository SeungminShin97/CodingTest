import java.io.*;
import java.util.*;

class coordinate {
    public int row;
    public int column;
    coordinate(int row, int column) {
        this.row = row;
        this.column = column;
    }
}

public class Main {
    public static int[][] arr;
    public static int metPersionN = 0;
    public static Queue<coordinate> q = new LinkedList<>();
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            for(int j = 0; j < m; j++) {
                if(input.charAt(j) == 'O')
                    arr[i][j] = 1;
                else if(input.charAt(j) == 'X')
                    arr[i][j] = -1;
                else if(input.charAt(j) == 'I') {
                    q.add(new coordinate(i, j));
                    arr[i][j] = 0;
                }
                else 
                    arr[i][j] = 2;
            }
        }

        while(!q.isEmpty()) {
            coordinate codi = q.poll();

            if(codi.row > 0 && arr[codi.row - 1][codi.column] > 0)
                function(codi.row - 1, codi.column);
            if(codi.row < n - 1 && arr[codi.row + 1][codi.column] > 0)
                function(codi.row + 1, codi.column);
            if(codi.column > 0 && arr[codi.row][codi.column - 1] > 0)
                function(codi.row, codi.column - 1);
            if(codi.column < m - 1 && arr[codi.row][codi.column + 1] > 0)
                function(codi.row, codi.column + 1);
        }

        System.out.println((metPersionN == 0) ? "TT" : metPersionN);
    }

    static void function(int r, int c) {
        if(arr[r][c] == 2)
            metPersionN++;
        arr[r][c] = 0;
        q.add(new coordinate(r, c));
    }
}


