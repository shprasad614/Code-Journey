public class upperbound 
{
    public int position(int arr[],int target)
    {
        int low = 0;
        int high = arr.length-1;
        int answer= arr.length;
        int mid=0;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            
                if(arr[mid]>target)
                {
                answer=mid;
                high=mid-1;
                }
                
            
            else{
                low=mid+1;
            }

        }
        return answer;

    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,8,8,10,10,11};
        
        upperbound ob = new upperbound();
        int result = ob.position(arr,2);
        System.out.println("upperbound " + result);

    }
}

