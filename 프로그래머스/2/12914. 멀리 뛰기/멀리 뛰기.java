class Solution {
    public long solution(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        for(int i = 0; i <= n; i++) {
            if(i + 1 <= n)
                arr[i + 1] = (arr[i + 1] + arr[i]) % 1234567;
            if(i + 2 <= n)
                arr[i + 2] = (arr[i + 2] + arr[i]) % 1234567;
        }
        return arr[n];
    }
}