import java.util.Arrays;

public class twosum {
//    public int[] twoSum(int[] numbers, int target) {
//        int temp[]=new int[2];
//
//        for(int i=0;i<numbers.length;i++)
//        {
//            for(int j=i+1;j<numbers.length;j++)
//            {
//                if(numbers[j]==target-numbers[i])
//                {
//                    if(numbers[i]<numbers[j])
//                    {
//                        temp[0]=i+1;
//                        temp[1]=j+1;
//                        return temp;
//                    }
//
//
//                }
//            }
//        }
//        return null;
public static int[] twoSum(int[] numbers, int target) {
    int temp[]=new int[2];
    int start=0;
    int end=numbers.length-1;
    while(start<end)
    {
        int sum=numbers[start]+numbers[end];
        if(sum==target)
        {
            temp[0]=start+1;
            temp[1]=end+1;
            break;
        }
        else if(sum>target)
        {
            end--;
        }
        else
        {
            start++;
        }

    }
    return temp;
}



    public static void main(String[] args) {
        int a[]={2,3,5,8,9};
        System.out.println(twoSum(a,10));
    }

}
