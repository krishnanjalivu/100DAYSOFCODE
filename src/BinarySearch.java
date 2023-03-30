public class BinarySearch {
    public static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>nums[mid])
            {
                start=mid+1;
            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }

        }
        return -1;

    }
    public static void main(String args[])
    {
        int a[]={1,5,6,8,9};
        int b=search(a,6);
        System.out.println(b);
    }
}
