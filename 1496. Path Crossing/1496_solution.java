public class HelloWorld{

     public static void main(String []args){
        Solution sol = new Solution();
        System.out.println(sol.isPathCrossing("NES"));
     }
}
     

class Solution {
    public boolean isPathCrossing(String path) { // 2 ms, faster than 53.48% 39.1 MB, less than 36.38%
        //   N
        // W   E
        //   S
        boolean flag = false;
        int fx = 0;
        int fy = 0;
        int[][] store = new int [path.length()+1][2];
        store[0][0] = fx;
        store[0][1] = fy;
        for (int i = 0; i<path.length(); i ++) {
            if(path.charAt(i) == 'N'){
                fx = fx + 0;
                fy = fy + 1;
            }else if (path.charAt(i) == 'W') {
                fx = fx + -1;
                fy = fy + 0;
            }else if (path.charAt(i) == 'E') {
                fx = fx + 1;
                fy = fy + 0;
            }else if (path.charAt(i) == 'S') {
                fx = fx + 0;
                fy = fy + -1;
            }
            for(int j = 0; j<i +1 ; j++){
                if(store[j][0] == fx && store[j][1] == fy){
                    flag = true; break;
                } 
            }
            if (flag == false){
                store[i+1][0] = fx;
                store[i+1][1] = fy;
            } else break;
        } 
        
        return flag;
        
    }
}
