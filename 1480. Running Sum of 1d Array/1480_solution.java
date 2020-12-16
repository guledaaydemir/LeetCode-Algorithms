public class HelloWorld{

     public static void main(String []args){
        Solution sol = new Solution();
        int[] nums = new int[]{1,2,3,4,5};
        sol.runningSum4(nums);
        printResult(nums);
     }
     
     public static void printResult(int[] nums) {
         for(int i=0;i<nums.length;i++){
             System.out.println(nums[i]);
         }
     }
}
     
class Solution {
    public int[] runningSum(int[] nums) { // 1 ms 39.4 MB 8.55 % 
        int x = 0;
        for( int i = nums.length - 1; i>0; i--)  {
            x = nums[i];
            for(int j = 0; j<i; j++) {
                x = x + nums[j];
            }
            nums[i] = x;
            x = 0;
        }
        return nums;
    }
    
    public int[] runningSum2(int[] nums) { // 3 ms 39.2MB 5.95%
        for( int i = nums.length - 1; i>0; i--)  {
            for(int j = 0; j<i; j++) {
                nums[i] = nums[i] + nums[j];
            }
        }
        return nums;
    }
    
    public int[] runningSum3(int[] nums) {  // 7 ms 39.6MB 	%6.24
        int x = nums.length-1;
        int i = 0;
        while(x >= 0){
            if( i == x) {
                x--;
                i=0;
            }else {
                nums[x] = nums[x] + nums[i];
                i++;
            }
        }
        return nums;
    }
    
    public int[] runningSum4 (int[] nums) {  // 0 ms 39.1 MB %100 
        for( int i = 1; i<nums.length; i++)  {
                nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}