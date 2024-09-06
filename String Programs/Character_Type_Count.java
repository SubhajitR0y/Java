import java.util.*;
class Character_Type_Count
{
    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String S = sc.nextLine();
        int dg = 0, alpha = 0, spec = 0;
        for (int i = 0; i < S.length(); i++) 
        {
            char c = S.charAt(i);
            if (Character.isDigit(c))
                dg++;
            else if (Character.isLetter(c))
                alpha++;
            else
                spec++;
        }
        System.out.println("Number of Digits - " + dg);
        System.out.println("Number of Alphabets - " + alpha);
        System.out.println("Number of Special characters - " + spec);
    }
}
