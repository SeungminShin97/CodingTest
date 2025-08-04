class Solution {
    public boolean[] visit;
    public int solution(String begin, String target, String[] words) {
        visit = new boolean[words.length];

        boolean exists = true;
        for(String word : words){
            if(word.equals(target)){
                exists = false;
                break;
            }
        }
        if(exists) return 0;

        int result = 100;
        for(int i = 0; i < words.length; i++){
            if(able(begin, words[i])) {
                visit[i] = true;
                result = Math.min(result, dfs(words, target, i, 1));
                visit[i] = false;
            }
        }
        return result == 100 ? 0 : result;
    }

    public int dfs(String[] words, String target, int index, int depth) {
        if(words[index].equals(target))
            return depth;
        int cnt = 100;
        for(int i = 0; i < words.length; i++){
            if(visit[i])
                continue;
            if(able(words[index], words[i])){
                visit[i] = true;
                cnt = Math.min(cnt, dfs(words, target, i, depth + 1));
                visit[i] = false;
            }
        }
        return cnt;
    }

    public boolean able(String begin, String word) {
        int cnt = 0;
        int length = word.length();
        for(int j = 0; j < length; j++){
            if(word.charAt(j) == begin.charAt(j))
                cnt++;
        }
        return length - cnt <= 1;
    }
}