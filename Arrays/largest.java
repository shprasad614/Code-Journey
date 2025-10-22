package revision;

public class largest {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,3,3,6,7,8,8,7,7};
        int n = arr.length;
        sort(arr,n);
        int largest = arr[n-1];
        int k=2;
        while(k<n)
        {
        
        if(largest != arr[n-k])
        {
            System.out.println(arr[n-k]);
            break;
        }
        k++;
    }

    }

    public static void sort(int arr[] , int n)
    {
        
        for(int i = 0 ; i< n-1; i++ )
        {
            int min = i;
            for(int j =i+1 ; j<n;j++)
            {
                if(arr[min]>arr[j])
                {
                    min =j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            
        }
    }
    
}
