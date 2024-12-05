class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0, result1 = 0, result2 = 0;
       
        if(arr1.length == arr2.length) {
            for(int i = 0; i < arr1.length; i++) {
                result1 += arr1[i];
                result2 += arr2[i];
            }
            if(result1 == result2)
                return 0;
            else if(result1 > result2)
                return 1;
            else
                return -1;
        } else if(arr1.length > arr2.length)
            return 1;
        else
            return -1;
        
        
    }
}