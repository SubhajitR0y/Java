import java.util.*;
class Substring_Pattern
{
    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String x = sc.next();
        for(int i=1;i<=x.length();i++)
            System.out.println(x.substring(0,i));
    }
}