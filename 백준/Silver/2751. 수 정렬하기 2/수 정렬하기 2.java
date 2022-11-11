import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static int[] copy;
    public static void Merge(int[] arr, int left, int mid, int right) {
        int low = left;
        int point = left;
        int high = mid + 1;
        while(low <= mid && high <= right) {
            if(arr[low] > arr[high]) {
                copy[point] = arr[high];
                high++;
            }
            else {
                copy[point] = arr[low];
                low++;
            }
            point ++;
        }
        while(low <= mid) {
            copy[point] = arr[low];
            low++;
            point++;
        }
        while(high <= right) {
            copy[point] = arr[high];
            high++;
            point++;
        }
        for(int i = left; i <= right; i++) 
            arr[i] = copy[i];
    }
    public static void Sort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            Sort(arr, left, mid);
            Sort(arr, mid + 1, right);
            Merge(arr, left, mid, right);
        }
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        copy = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Sort(arr, 0, arr.length - 1);
        for(int i : arr)
            bw.write(Integer.toString(i) + "\n");
        bw.flush();
    }
}