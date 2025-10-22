public class largest_element
{
    public static int sec_largest(int []arr , int n)
    {
   
         
        int largest = arr[0];
        int sec_largest = Integer.MIN_VALUE;

        for(int i =1;i<n;i++)
        {
            if(arr[i] > largest)
            {
                sec_largest = largest;
                largest = arr[i];

            }
            else if(arr[i]> sec_largest && arr[i] != largest)
            {
                sec_largest = arr[i];
                
            }

        }
        return sec_largest;
    }


        public static void main(String[] args) 
        {
        int arr[] = {2,4,1,5,6,2,8,9,9,5,7};
        int n = arr.length;
        int num = sec_largest(arr , n);
        System.out.println(num);
        }
}



