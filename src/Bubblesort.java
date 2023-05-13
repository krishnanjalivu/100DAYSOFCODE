import java.util.Arrays;
public class Bubblesort {
    public static void main(String[] args) {
    int a[]={-31,1,2,3,4,5,-10};
    bubble(a);
    System.out.println(Arrays.toString(a));

    }
    static void bubble(int arr[])
    {
        boolean swapped;
        for(int i=0;i<arr.length;i++)
        {
         swapped=false;
         for(int j=1;j< arr.length-i;j++)
         {
             if(arr[j]<arr[j-1]) {
                 int temp = arr[j];
                 arr[j] = arr[j - 1];
                 arr[j - 1] = temp;
                 swapped=true;
             }
         }
         if(!swapped)
         {
             break;
         }
        }
    }
}
