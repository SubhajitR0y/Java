import java.util.Scanner;
class Vowel_Count
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String x = sc.nextLine();
        int v = 0;
        for(int i=0;i<x.length();i++)
        {
            char ch = x.charAt(i);
            ch = Character.toLowerCase(ch);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                v++;
        }
        System.out.println(v+" Vowels");
    }
}