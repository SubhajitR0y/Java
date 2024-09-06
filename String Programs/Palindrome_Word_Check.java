import java.util.*;
class Palindrome_Word_Check
{
    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String rev="";
        for(int i=0 ; i<x.length() ; i++)
            rev=x.charAt(i)+rev;
        System.out.println(x.equalsIgnoreCase(rev)?(x+" is a palindrome number"):(x+" is not a palindrome number"));
    }
}