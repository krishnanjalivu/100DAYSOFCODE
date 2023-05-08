public class findinmountainarray {
    public static int search(int arr[],int target)
    {
       int peak= find(arr);
       int first=binarysearch(arr,target,0,peak);
       if(first!=-1)
       {
           return first;
       }
       return binarysearch(arr,target,peak+1,arr.length-1);
    }

    public static  int find(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else {
                start=mid+1;
            }
        }
        return start;
    }

    public static int binarysearch(int arr[],int target,int start,int end) {

        boolean isasc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isasc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }


            }
        }


        return -1;
    }

                public static void main (String[]args){
               int a[]={4,5,6,7,8,6,3,2,1};
               int b=search(a,5);
                    System.out.println(b);
                }
            }

