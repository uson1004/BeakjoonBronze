class Solution {
    public String solution(String my_string, int n) {
        int l = Integer.valueOf(my_string.length()) - n;
        String answer = my_string.substring(l);
        
        return answer;
    }
}