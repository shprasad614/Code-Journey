import java.util.HashMap;
import java.util.HashSet;

public class CONSECUTIVE {
    public static void main(String[] args) {
        
        // int count;
        // int max=0;
        // for(int i=0;i<arr.length-1;i++)
        // {
        //     count=0;
        //     int value = arr[i];
        //     for(int j =0;j<arr.length;j++)
        //     {
        //         if(arr[j]==value+1)
        //         {
        //             count++;
        //             value=value+1;
        //         }
        //     }
        //     max=Math.max(max,count);
        // }
        // System.out.println(max);

        int arr[]={5,102,4,100,101,1,11,3,2};
        HashSet<Integer> cons = new HashSet<>();
        for(int j : arr)
        {
            cons.add(j);
        }  
        // int i=0; 
        // int num = arr[i];
        // int count=0;
        // while(i<arr.length)
        // {
        //     if(cons.contains(num))
        //     {
        //     count++;
        //     num = num+1;
        //     }
        //     else{

        //     }

        // }
        

        int maxi=0;
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            int x=arr[i];
            if(!cons.contains(x-1)){
                c=1;
                while(cons.contains(x+1))
                {   
                    x+=1;
                    c++;
                }
            }
            maxi=Math.max(maxi,c);
        }
        System.out.println(maxi);
    }
}
