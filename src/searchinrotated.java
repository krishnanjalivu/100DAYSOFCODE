public class searchinrotated {
    public static int pivot(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;

            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start])
            {
                end=mid-1;
            }
            else {
                 start=mid+1;
            }
        }
        return -1;
    }
    public static int binarysearch(int arr[],int target,int start,int end)
    {
        while(start<=end)
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
    public static int search(int arr[],int target)
    {
        int pivot=pivot(arr);
        if(pivot==-1){
            return binarysearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target)
        {
            return pivot;
        }
        if(target>arr[0])
        {
            return binarysearch(arr,target,0,pivot-1);
        }
        return binarysearch(arr,target,pivot-1,arr.length-1);
    }
    public static int dupilcates(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;

            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[mid]==arr[end])
            {
                if(arr[start]>arr[start+1])
                {
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1])
                {
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid]||(arr[start]==arr[mid] && arr[mid]>arr[end]))
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
     int a[]={7,8,10,3,4,5,6};
     int b=search(a,4);
        System.out.println(b);
    }
}
