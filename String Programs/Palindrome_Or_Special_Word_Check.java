import java.util.*;
class Palindrome_Or_Special_Word_Check
{
    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        x = x.toUpperCase();
        String rev="";
        for(int i=0 ; i<x.length() ; i++)
            rev=x.charAt(i)+rev;
        if(rev.equals(x))
            System.out.println(x+" is a palindrome word.");
        else if(rev.charAt(0)==x.charAt(0))
            System.out.println(x+" is only a special word.");
        else
            System.out.println(x+" is a neither a palindrome nor a special word.");
    }
}