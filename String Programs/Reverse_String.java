import java.util.*;
class Reverse_String
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String x = sc.nextLine();
        int l = x.length();
        for(int i=0;i<l;i++)
            System.out.println(x.charAt(i));
    }
}