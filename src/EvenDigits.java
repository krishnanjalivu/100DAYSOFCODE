public class EvenDigits {
    public static int count(int num)
    {
        int count=0;
        while(num>0)
        {
            count++;
            num=num/10;
        }
        return count;
    }
    public static boolean even(int number)
    {
        if(count(number)%2==0)
        {
            return true;
        }
        return false;
    }
    public static int evendigits(int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(even(arr[i])==true)
            {
                count++;
            }
        }
        return count;
    }
    public static void main (String args[]) {
        int a[] = {564, 89, 326, 2, 445672};
        int b = evendigits(a);
        System.out.println(b);
    }
}
