public class HelloWorld{

     public static void main(String []args){
        Solution sol = new Solution();
        System.out.println(sol.average([4000,3000,1000,2000]));
     }
}
     
class Solution {
    public double average(int[] salary) { // 0 ms %100 36.8 MB %60.08 
        int min = salary[0];
        int max = salary[(salary.length)-1];
        
        for(int i = 0; i< salary.length; i++) {
            if (salary[i] > max) {
                max = salary[i];
            } else if( salary[i] < min) {
                min = salary[i];
            }
        }
        double result= 0;
        for(int i = 0; i< salary.length; i++) {
           if(salary[i] != min && salary[i] != max){
               result = result + salary[i];
           }
        }
        
        result = result / (salary.length - 2);
        return result;
    }
}