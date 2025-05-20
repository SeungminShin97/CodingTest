class Solution {
    public int solution(int[] numbers) {
        int[] arr = new int[10];
        for(int i : numbers) 
            arr[i]++;
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0)
                result += i;
        }
        return result;
    }
}