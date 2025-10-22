import java.util.*;

public class union {
    public static void main(String[] args) {
        int arr[] ={11,3,4,4,6,3,5,3,53,3,9,7};
        int arr1[] ={12,4,6,4,7,8,1,3,6,4,9};
        Arrays.sort(arr);
        Arrays.sort(arr1);
        int n = arr.length;
        int n1 = arr1.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> union = new ArrayList<>();

       
        while(i < n && j < n1)
        {
            if(arr[i] < arr1[j])
            {
                addunion(union,arr[i]);
                i++;
            }
            else if(arr[i] > arr1[j])
            {
                addunion(union,arr1[j]);
                j++;
            }
            else
            {
                addunion(union,arr[i]);
                i++;
                j++;
            }
        }
        while(i<n)
        {
            addunion(union,arr[i]);
            i++;
        }
         while(j<n1)
        {
            addunion(union,arr[j]);
            j++;
        }

        System.out.println(union);
       
    }

     public static void addunion(ArrayList<Integer> union , int value)
        {
            if(union.isEmpty() || union.get(union.size()-1) != value)
            {
                union.add(value);
            }
        }
    
}
