public class maximumcount {
    public static int maximumCount(int[] nums) {
        int pos=0;
        int neg=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                pos++;
            }
            if(nums[i]<0)
            {
                neg++;
            }
        }
        if(pos>neg)
        {
            return pos;
        }
        return neg;
    }


    public static void main(String args[])
    {
        int a[]={1,5,6,8,9};
        int b=maximumCount(a);
        System.out.println(b);
    }
}
