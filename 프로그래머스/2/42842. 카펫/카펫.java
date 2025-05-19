class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int sqrt = (int) Math.sqrt(sum);
        for(int i = 3; i <= sqrt; i++) {
            if(sum % i == 0 && 2 * (i + sum / i) - 4 == brown)
                return new int[] {sum / i, i};
        }
        return null;
    }
}