public class sort012 {
    public static void main(String[] args) {
        // String a="123";

        // permutation(a);
        int a[]={2,0,2,1,1,0};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else
                {
                    break;
                }
            }
        }
    }
}
