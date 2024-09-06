import java.util.*;
class PigLatin
{
    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String x = sc.nextLine();
        int v1=-1;
        String result="", vow = "AEIOUaeiou";
        both:
        for (int i=0;i<x.length();i++) 
        {
            char ch = x.charAt(i);
            for(int k=0;k<vow.length();k++)
                if(ch==vow.charAt(k))
                {
                    v1 = i;
                    break both;
                }
        }
        if(v1>0)
            result = x.substring(v1)+x.substring(0,v1)+"ay";
        else if(v1==0)
            result = x+"yay";
        else if(v1==-1)
            result = "y"+x+"ay";
        System.out.println(result.toUpperCase());
        }
    }