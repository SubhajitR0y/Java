import java.util.*;
class New_Word
{
    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st string: ");
        String x1 = sc.nextLine();
        System.out.print("Enter the 2nd string: ");
        String x2 = sc.nextLine();
        for (int i = 0; i < x1.length(); i++)
            System.out.print(x1.charAt(i)+""+x2.charAt(i));
    }
}