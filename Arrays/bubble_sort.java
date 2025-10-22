public class bubble_sort
 {
    public static void main(String[] args) 
    {
         int arr[] = {13,46,24,52,20,9};
      int n = arr.length;
      
        
        for(int i = n-1 ; i>=1 ;i--)
        {
            int did_swap = 0;
            for(int j= 0 ; j<i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    did_swap=1;
                }
             

            }
               if(did_swap == 0)
                {
                    break;
                }

        }
        for(int i : arr)
        {
            System.out.print(i + " ");
        }
        
    }
    
}
