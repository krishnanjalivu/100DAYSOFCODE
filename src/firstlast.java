import java.util.Arrays;
public class firstlast {
    public static int[] searchRange(int[] nums, int target) {
        int a[]={-1,-1};
        a[0]=binarysearch(nums,target,true);
        if(a[0]!=-1)
        {
            a[1]=binarysearch(nums,target,false);
        }
        return a;

    }
    public static int binarysearch(int arr[],int target,boolean findstartindex)
    {
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                ans=mid;
                if(findstartindex)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={2,2,2,7,7,7,8,9,10};
        int []b=searchRange(a,2);
        System.out.println(Arrays.toString(b));
    }
}
