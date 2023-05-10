public class twosum {
    public int[] twoSum(int[] numbers, int target) {
        int temp[]=new int[2];

        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[j]==target-numbers[i])
                {
                    if(numbers[i]<numbers[j])
                    {
                        temp[0]=i+1;
                        temp[1]=j+1;
                        return temp;
                    }


                }
            }
        }
        return null;

    }
}
