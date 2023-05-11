public class reversestrings3 {
    public static void reverse(char ch[],int start,int end)
    {
        while(start<end)
        {
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
    }
    public static String reverseWords(String s) {
        char ch[]=s.toCharArray();
        int start=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==' ')
            {
                reverse(ch,start,i-1);
                start=i+1;
            }
            else if(i==ch.length-1)
            {
                reverse(ch,start,i);
            }

        }
        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String s="let's have a great day";
        String c=reverseWords(s);
        System.out.println(c);
    }
}
