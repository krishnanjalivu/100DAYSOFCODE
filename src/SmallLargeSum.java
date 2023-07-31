import java.util.ArrayList;
import java.util.Collections;

public class SmallLargeSum {
    public static void main(String[] args) {
      int a[]={3,2,1,7,5,4};
      System.out.println(smalllarge(a));
    }
    public static int smalllarge(int arr[])
    {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {

            if(arr.length==0 || arr.length<=3)
            {
                return 0;
            }
            if(i%2==0)
            {
                list1.add(arr[i]);

            }
            else {
                list2.add(arr[i]);

            }
        }
        Collections.sort(list1);
        int max1=list1.get(list1.size()-2);
        Collections.sort(list2);
        int max2=list2.get(list2.size()-2);

        return max1+max2;
    }
}
