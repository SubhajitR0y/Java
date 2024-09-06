import java.util.*;
class Substring_Reverse_Pattern
{
    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String x = sc.next();
        for(int i=x.length()-1;i>=0;i--)
            System.out.println(x.substring(i));
    }
}