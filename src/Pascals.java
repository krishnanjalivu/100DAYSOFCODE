public class Pascals {
    public static void main(String[] args) {

        matrix(5);

    }
    public static void matrix(int m)
    {
        int a[][]=new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    a[i][0]=1;
                    a[i][i]=1;
                }
                else
                {
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
                }
                System.out.print(a[i][j]);

            }
            System.out.println();

        }

    }
}
