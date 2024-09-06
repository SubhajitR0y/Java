import java.util.Scanner;
class Vowel_Remove
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String x = sc.nextLine();
        for(int i=0;i<x.length();i++)
        {
            char ch = x.charAt(i);
            ch = Character.toLowerCase(ch);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                System.out.print(x.charAt(i));
        }
    }
}