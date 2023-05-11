public class reversestring2 {
    public void reverse(char ch[],int start,int end)
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
    public String reverseStr(String s, int k) {
        char ch[]=s.toCharArray();

        for(int i=0;i<ch.length;i=i+2*k)
        {
            int start=i;
            int end=Math.min(i+k-1,ch.length-1);
            reverse(ch,start,end);
        }
        return String.valueOf(ch);


    }
}
