import java.util.Scanner;
class Concat_Addition
{
    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String x = sc.nextLine();
        String add = "";
        for (int i = 0; i < x.length(); i++) 
        {
            add+=x.charAt(i);
            System.out.println(add);
        }
    }
}