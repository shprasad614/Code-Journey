
class solution {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        for(int j = 0 ; j<n ; j++ )
        {
            if(nums[j] != 0)
            {
               nums[i] = nums[j];
               i++;
               nums[j] = 0;
            }
        }
        for(int k : nums)
        {
            System.out.print(k + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,0,0,0,1,2,3,4,0,0,0,5,6,7,0,8,9,0};
        moveZeroes(arr);
    }
}