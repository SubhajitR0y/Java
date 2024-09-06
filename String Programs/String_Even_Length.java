import java.util.*;
class String_Even_Length
{
    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        String x[] = new String[10];
        for (int i = 0; i < x.length; i++) 
        {
            System.out.print("Enter string " + (i + 1) + ": ");
            x[i] = sc.nextLine();
        }
        System.out.println("Strings with even number of characters:");
        for (int i = 0; i < x.length; i++) 
            if (x[i].length() % 2 == 0) 
                System.out.println(x[i]);
    }
}