public class HelloWorld{

     public static void main(String []args){
        Solution sol = new Solution();
        System.out.println(sol.kthFactor5(12,3));
     }
}
     
class Solution {
    public int kthFactor1(int n, int k) { // 1 ms %34.06 36.2 MB %7.01
        int[] nums = new int[n];
        int j = 0;
        for (int i = 1; i <= n; ++i) {
              if(n % i == 0){
                  nums[j]= i;
                  j++;
              }
        }
        for (int i = j; i<n ; i++) {
             nums[j] = -1;
        }
        return nums[k-1];
    }
    
    public int kthFactor2(int n, int k) { // 1ms 42.71% 36.1 MB 13.11%
        int[] nums = new int[n];
        int j = 0;
        for (int i = 1; i <= n; ++i) {
              if(n % i == 0){
                  nums[j]= i;
                  j++;
              }
        }
        return k>j ? -1 : nums[k-1];
    }
    
     public int kthFactor3(int n, int k) { // 1 ms 42.71% 35.9 MB 32.87%
        int j = 0;
        for (int i = 1; i <= n; ++i) {
              if(n % i == 0){
                  j++;
              }
        }
        int[] nums = new int[j];
        j = 0;
        for (int i = 1; i <= n; ++i) {
              if(n % i == 0){
                  nums[j]= i;
                  j++;
              }
        }
        return k>j ? -1 : nums[k-1];
    }
    
    public int kthFactor4(int n, int k) { // 19 ms 8.65% 38.7 MB 5.08%
      
        String s = "";
        for (int i = 1; i <= n; ++i) {
              if(n % i == 0){
                  s = s + "," + i;
              }
        }
        String[] ss = s.split(",", k+5);
        return k>=ss.length ? -1 :  Integer.parseInt(ss[k]) ;
    }
    
    public int kthFactor5(int n, int k) { // 0 ms 100.00% 36 MB 32.87%
        int[] factors = new int[n];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { 
              factors[j] = i;
             j++;
             }
            if (j == k) return factors[k - 1];
        }
        return -1;
    }
}