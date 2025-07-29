class Solution {
    public int solution(int[] a, int[] b) {
        int cnt = 0;
        for(int i = 0; i < a.length; i++) {
            cnt += a[i] * b[i];
        }
        return cnt;
    }
}