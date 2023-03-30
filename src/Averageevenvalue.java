public class Averageevenvalue {
    public static int averageValue(int[] nums)
    {
        int count=0;
        int sum=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                if(nums[i]%3==0)
                {
                    count++;
                    sum=sum+nums[i];
                }
            }

        }
        if(count!=0)
        {
            int avg=(int)(sum/count);
            return avg;
        }
        return 0;
    }
    public static void main(String args[])
    {
        int a[]={6,12,9,24,52};
        int b=averageValue(a);
        System.out.println(b);
    }}
