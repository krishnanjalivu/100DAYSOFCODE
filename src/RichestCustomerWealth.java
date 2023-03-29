public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        {
            int ans=Integer.MIN_VALUE;
            for(int i=0;i<accounts.length;i++)
            {
                int sumr=0;
                for(int j=0;j<accounts[i].length;j++)
                {
                    sumr=sumr+accounts[i][j];
                }
                if(sumr>ans)
                {
                    ans=sumr;
                }


            }
            return ans;
        }

    }
    public static void main(String args[])
    {
        int a[][]={{5,9,6},{8,2,1},{8,6,19}};
        int b=maximumWealth(a);
        System.out.println(b);
    }
}
