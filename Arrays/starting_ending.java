public class starting_ending {
    public static int[] startend(int arr[],int target)
    {
         int starting=-1;
             int    ending=-1;
               int  count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target && count<1)
            {
                starting=i;
                count++;
            }
            if(arr[i]==target && count>=1)
            {
                ending=i;
                count++;
            }
        }
        return new int[] {starting,ending};
    }
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,8,8,8,9,10};
        int target=8;
        int result[]=startend(arr, target);
        System.out.println(result[0] +" "+ result[1]);
        
        
    }
    
}
