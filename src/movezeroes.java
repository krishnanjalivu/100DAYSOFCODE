import java.util.Arrays;

public class movezeroes {
        public static void moveZeroes(int[] nums) {

            int k=0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]!=0)
                {
                    nums[k]=nums[i];
                    k++;
                }
            }
            while(k<nums.length)
            {
                nums[k]=0;
                k++;
            }

        }

    public static void main(String[] args) {
        int arr[]={2,0,3,0,1,5};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }

}
