public class HelloWorld{

     public static void main(String []args){
        Solution sol = new Solution();
        int[] nums = new int[] {1,2};
        System.out.println(sol.missingNumber5(nums));
     }
}
     
class Solution {
    public int missingNumber(int[] nums) { // 151 ms, faster than 5.44%  39.4 MB, less than 65.91%
        for (int i = 0; i< nums.length ; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == i) {
                    break;
                } else if ( j + 1 == nums.length ) {
                     return i;
                }
            }
            if((i+1) == nums.length) {
                return i+1;
            }
        } 
        return -1;
    }
    
     public int missingNumber1(int[] nums) { // 277 ms, faster than 5.44% 39.5 MB, less than 41.27%
        for (int i = 0; i< nums.length ; i++) { // 0 ... n 
            System.out.println(" " + ((nums.length/2) + 1));
            for (int j = 0; j < (( nums.length / 2 ) + 1) ; j++) { 
                if (nums[j] == i || nums[nums.length - (j+1)] == i) {
                    break;
                } else if ( (j + 1) == ((nums.length/2) + 1) ) {
                    return i;
                }
               
            }
              if((i+1) == nums.length) {
                return i+1;
            }
        } 
        
        return -1;
    }
    
    //LeetCode Solution  5 ms, faster than 25.64% 39.2 MB, less than 87.65%
    public int missingNumber2(int[] nums) {
        Arrays.sort(nums);
        
        // Ensure that n is at the last index
        if (nums[nums.length-1] != nums.length) {
            return nums.length;
        }
        // Ensure that 0 is at the first index
        else if (nums[0] != 0) {
            return 0;
        }
        
        // If we get here, then the missing number is on the range (0, n)
        for (int i = 1; i < nums.length; i++) {
            int expectedNum = nums[i-1] + 1;
            if (nums[i] != expectedNum) {
                return expectedNum;
            }
        }
        
        return -1;
    }
    
    //LeetCode Solution 1 ms, faster than 40.67% 48.2 MB, less than 5.37%
     public int missingNumber3(int[] nums) {
        int expectedSum = nums.length*(nums.length + 1)/2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }
    
    // https://leetcode.com/SpecialYang solution in discussion 1 ms, faster than 40.67%  48.3 MB, less than 5.37%
    public int missingNumber4(int[] nums) {
        int diff = 0;
        for (int i = 0; i < nums.length; i++) {
            diff += nums[i] - i;
        }
        return nums.length - diff;      
    }
    
    // https://leetcode.com/zhouzhao solution in discussion 0 ms, faster than 100.00% 48.3 MB, less than 5.37%
    public int missingNumber5(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
        }
    
        return nums.length * (nums.length + 1) / 2 - sum;   
    }
    
}

   
