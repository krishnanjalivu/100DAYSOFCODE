public class firstposition {
    public static int find(int a[],int target)
    {
        int start=0;
        int end=1;
        while(target>a[end])
        {
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarysearch(a,target,start,end);
    }

    public static int binarysearch(int arr[],int target,int start,int end) {
        while (start <= end)
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
                return mid;
            }

        }
    return -1;
    }

    public static void main(String[] args) {
        int b[]={2,3,5,6,7,8,9,11,23,45};
        int c=find(b,11);
        System.out.println(c);
    }
}
