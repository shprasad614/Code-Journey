import java.util.HashSet;

public class missing_num {
    public static void main(String[] args) {
        int arr[] ={2,1,4,3,5};
        int n = 6;
/////////////// brutt force apporach ///////////////////
        // int num = 1;
        // while(num <= n){
        //     int count=num;
        //      //count = 0;
        // for(int i =0 ;i<n ; i++){
        //     if(arr[i] == num){
        //         num++;
        //     }   
        // }
        // if(num == count ){
        //     System.out.println(count);
        //     break;
        // }
       
        // }
     //////////////////////////////////////////////////
     /// BETTER APPORACH O(N) ////////////////////
     /// 
     /// class Solution {
    // public int missingNumber(int[] nums) {
    //     int n = nums.length;
    //     HashSet<Integer> set = new HashSet<>();
        
    //     for(int i : nums)
    //     {
    //         set.add(i);
    //     }

    //     for(int i = 0; i<=n ;i++)
    //     {
    //         if(!set.contains(i))
    //         {
    //             return i;
                
    //         }
    //     }
    //     return -1;
        
//     }
// }




/////////////////////////////OPTIMAL APPORACH  ///////////////////////
/// sum of n natural number - sum of array element gives the missing numbers

        // int sum = (n*(n + 1))/2;
        // int sum1 = 0 ;
        // for(int i = 0 ;  i<arr.length;i++ )
        // {
        //     sum1 += arr[i];

        // } 
        //  System.out.println(sum - sum1);


        /////////////////////one more optimal apporach //////////////////////
        /// 
        
    }
    
}
