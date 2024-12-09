import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for(int i = 0; i < strArr.length; i++) {
            if(i % 2 == 0)
                answer[i] = strArr[i].toLowerCase().toString();
            else
                answer[i] = strArr[i].toUpperCase().toString();
        }
        
        return answer;
    }
}