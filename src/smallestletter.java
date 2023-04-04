public class smallestletter {
    public static char letters(char letter[],char target)
    {
        int start=0;
        int end=letter.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<letter[mid])
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return letter[start%letter.length];
    }

    public static void main(String args[])
    {
        char arr[]={'a','b','e','f','g'};
        char ch=letters(arr,'d');
        System.out.println(ch);
    }
}



