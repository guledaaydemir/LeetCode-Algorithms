public class HelloWorld{

     public static void main(String []args){
        Solution sol = new Solution();
        System.out.println(sol.reformatDate3("6th Jun 1933"));
     }
}
     
class Solution {
    public String reformatDate1(String date) { // 11 ms, faster than 22.32% 37.7 MB, less than 49.81%
        String reformat = "";
        String[] arr = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; 
        if(date.length() < 13) date = "0" + date;
        for (int num = 0; num < arr.length; num++){
            if(arr[num].equals(date.substring(5,8))){
                arr[0] = (num+1 < 10) ? ("0" + (num+1)) : ""+(num+1);
                reformat = date.substring(9,13) + "-" + arr[0] + "-" + date.substring(0,2);
                break;
            }
        }
        
        return reformat;
    }
    
    public String reformatDate2(String date) { // : 9 ms, faster than 32.68% 39.5 MB, less than 9.00% 
        String[] arr = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; 
        if(date.length() < 13) date = "0" + date;
        for (int num = 0; num < arr.length; num++){
            if(arr[num].equals(date.substring(5,8))){
                arr[0] = (num+1 < 10) ? ("0" + (num+1)) : ""+(num+1);
                arr[0] = date.substring(9,13) + "-" + arr[0] + "-" + date.substring(0,2);
                break;
            }
        }
        
        return arr[0];
    }
    
    public String reformatDate3(String date) { //  7 ms, faster than 44.51% 37.4 MB, less than 78.67%
        String[] arr = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; 
        if(date.length() < 13) date = "0" + date;
        for (int num = 0; num < arr.length; num++){
            if(arr[num].equals(date.substring(5,8))){
                num++;
                arr[0] = (num < 10) ? ("0" + (num)) : ""+(num);
                arr[0] = date.substring(9,13) + "-" + arr[0] + "-" + date.substring(0,2);
                break;
            }
        }
        
        return arr[0];
    }
}


   
