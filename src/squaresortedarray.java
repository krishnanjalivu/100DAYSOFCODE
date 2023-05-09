import java.util.Arrays;
public class squaresortedarray {
    public static int[] bubblesort(int arr[])
    {
        boolean swapped;
        for(int i=0;i<arr.length;i++)
        {

            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
            }
        }
        return arr;

    }
    public static int[] sortedSquares(int[] nums) {
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            a[i]=nums[i]*nums[i];
        }
        bubblesort(a);
        return a;

    }
    public static void main(String args[])
    {
        int a[]={-4,-1,0,2,3};
        int b[]=sortedSquares(a);
        System.out.println(Arrays.toString(b));


    }
}
