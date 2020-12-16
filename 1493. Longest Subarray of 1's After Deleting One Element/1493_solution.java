public class HelloWorld{

     public static void main(String []args){
        Solution sol = new Solution();
        int[] nums = new int[]{0,1,1,1,0,1,1,0,1};
        System.out.println(sol.longestSubarray3(nums));
     }
}
     
class Solution {
     public int longestSubarray1(int[] nums) { //1841 ms 5.57% 48.2 MB 25.05%
        int max = 0;
        int result = 0;
        int flag = 0;
        
        for(int i = 0; i<nums.length; i ++) {
            if( nums[i] == 1) {
                 for (int j = i ; j<nums.length; j ++) {
                if(nums[i] == nums[j]){
                    max ++;
                }
                else flag ++;
                
                if (flag == 2 ) break;
            }
            if(result < max) result = max;
            max = 0;
            flag = 0;
            }
        }
        
        return result == nums.length && nums[0] == 0 ? 0 : result == nums.length && nums[0] == 1? result -1 : result ;
    }
    
    public int longestSubarray2(int[] nums) { //Time Limit Exceeded
        int max = 0;
        int result = 0;
        int flag = 0;
        
        for (int i = 0 ; i < nums.length ; i ++) {
            if(nums[i] != 0 ){
                for(int j = i ; j < nums.length; j ++) {
                    if(nums[j] == 1) max ++;
                    else flag ++;
                    
                    if (max > result) result = max;
                    if (flag == 2){
                        max = 0;
                        flag = 0;
                        break;
                    } 
                }
            }
            max = 0;
            flag = 0;
        }
        
        
        return result == nums.length && nums[0] == 0 ? 0 : result == nums.length && nums[0] == 1? result -1 : result;
    }
    
    //https://poitevinpm.medium.com/leetcode-1493-longest-subarray-of-1s-after-deleting-one-element-330e1412c636
    public int longestSubarray3(int[] nums) { //2 ms, faster than 56.32% 47.7 MB, less than 75.80% 
        int n = nums.length;
        boolean hasZero = false;
        int current = 0;
        int zeros = 0;
        int previous = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 0) {
                hasZero = true;
                zeros++;
                if (zeros == 1) {
                    // first 0
                    int chain = current + previous;
                    if (chain > max) {
                        max = chain;
                    }
                    previous = current;
                    current = 0;
                } else {
                    previous = 0;
                }
            } else {
                current++;
                if (current == 1) {
                    // first 1
                    zeros = 0;
                }
            }
        }
        if (!hasZero) {
            return n - 1;
        }
        int chain = current + previous;
        if (chain > max) {
            max = chain;
        }
        return max;
    }
}