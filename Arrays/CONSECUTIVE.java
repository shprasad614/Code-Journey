import java.util.HashMap;
import java.util.HashSet;

public class CONSECUTIVE {
    public static void main(String[] args) {
        int arr[]={5,102,4,100,101,1,11,3,2};
        HashSet<Integer> cons = new HashSet<>();
        for(int j : arr)
        {
            cons.add(j);
        }  

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
