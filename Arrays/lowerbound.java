public class lowerbound {
    public int position(int arr[],int target)
    {
        int low =0;
        int high = arr.length-1;
        int mid =0;
        int ans=arr.length;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(arr[mid]>=target)
            {
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
        }
        return ans;

    }
    
}
class object
{
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,8,8,10,10,11};
        
        lowerbound ob = new lowerbound();
        int result = ob.position(arr,9);
        System.out.println("lower bound of 9 is: " + result);

    }
}
