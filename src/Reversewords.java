import java.util.*;
public class Reversewords {
    public static void main(String args[])
    {
        String s="geeks quiz practice code";
        System.out.println(reverses(s) );
    }
    public static char[] reverses(String s)
    {
        StringBuilder str=new StringBuilder(s);
        String revstr= str.reverse().toString();
        char[] arr=revstr.toCharArray();
        int start=0;
        for(int i=0;i<arr.length;i++) {
                if (arr[i] == ' ') {
                    rever(arr,start,i-1);
                    start=i+1;
                }
            }
        rever(arr,start,arr.length-1);
        return arr;
        }
        public static void rever(char str[],int start,int end)
        {
            while(start<=end) {
                char temp = str[start];
                str[start] = str[end];
                str[end] = temp;
                start++;
                end--;
            }
        }

    }


