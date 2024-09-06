import java.util.*;
class ISBN_Check
{
    static void main()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the ISBN : ");
        String x = sc.next();
        int n,sum=0;
        if(x.length()!=10)
            System.out.println("Illegal ISBN");
        else
        {
            for(int i=0;i<x.length();i++)
            {
                n = x.charAt(i)-'0';
                sum+=n*(i+1);
            }
            if(sum%11==0)
                System.out.println("Legal ISBN");
            else
                System.out.println("Illegal ISBN");
        }
    }
}