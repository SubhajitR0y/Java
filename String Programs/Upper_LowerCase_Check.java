import java.util.*;
class Upper_LowerCase_Check
{
    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String x = sc.nextLine();
        int up = 0, low = 0;
        for (int i = 0; i < x.length(); i++) 
        {
            char ch = x.charAt(i);
            if (Character.isUpperCase(ch))
                up++;
            else if (Character.isLowerCase(ch))
                low++;
        }
        System.out.println("Capital = " + up);
        System.out.println("Small = " + low);
    }
}