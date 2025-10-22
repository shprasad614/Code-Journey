public class sample {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int sec_largest=Integer.MIN_VALUE;
        int arr[]={90,80,80,60};
        for(int i =0 ;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                sec_largest=largest;
                largest=arr[i];
            }
            else if(sec_largest < arr[i] && arr[i] != largest)
            {
                sec_largest=arr[i];
            }
        }
        int c1=-1;
        int c2=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==largest)
            {
                c1++;
                
            }
            if(arr[i]==sec_largest){
            c2++;
            
            }
            // if(c1>=2)
            // {
            //     c1=c1-t1;
            // }
            // if(c2>=2)
            // {
            //     c2=c2-t2;
            // }


        }

        System.out.println(c1+c2);

    }
}
       