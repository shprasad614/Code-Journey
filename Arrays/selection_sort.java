public class selection_sort 
{
    // public static void main(String[] args)
    // {
    //     int arr[] = {13,46,24,52,20,9};
    //     int n = arr.length;

    //     for(int i = 0; i<n-1;i++)
    //     {
    //         for(int j = i+1; j<n; j++)
    //         {
    //             if(arr[i] > arr[j])
    //             {
    //                 int temp = arr[j];
    //                 arr[j] = arr[i];
    //                 arr[i] = temp;
    //             }
    //         }
    //     }
    //     for (int i : arr)
    //     {
    //         System.out.print(i + " ");
    //     }
        
    // }


    public static void main(String[] args) {
         int arr[] = {13,46,24,52,20,9};
      int n = arr.length;
      

        for(int i =0; i<=n-2; i++)
        {
           int min = i;
            for(int j=i+1;j<=n-1;j++)
            {
                if(arr[j] < arr[min])
                {
                min = j;
                }
            }
             int temp = arr[min];
                  arr[min] = arr[i];
                   arr[i] = temp;
        }
         for (int i : arr)
        {
            System.out.print(i + " ");
        }
        
    }
    
}
