public class Setzeroes {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{1,0,1},{1,1,1}};
        matrix(a);
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        // System.out.println("Hello, World!");
    }
    public static void matrix(int a[][])
    { boolean set=true;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==0 && set)
                {
                    for(int k=0;k<a.length;k++)
                    {
                        a[i][k]=0;
                        a[k][j]=0;
                        set=false;
                    }
                }

            }

        }

    }
}
