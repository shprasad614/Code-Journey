public class sorted_array 
{
    public static boolean sorted(int []arr , int n)
    {
        for(int i = 1; i<= n-1 ; i++)
        {
            if(arr[i-1] >= arr[i] )
            {
                return false;
            }

        }
        return true;
    }
     public static void main(String[] args) 
        {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        boolean num = sorted(arr , n);
        System.out.println(num);
        }
    
}
