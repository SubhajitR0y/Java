import java.util.*;
class String_Lengthwise_SelectionSort
{
    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        String x[] = new String[4];
        for (int i = 0; i < x.length; i++) 
        {
            System.out.print("Enter string " + (i + 1) + ": ");
            x[i] = sc.nextLine();
        }
        int min;
        String temp;
        for (int i = 0; i < x.length - 1; i++) 
        {
            min = i;
            for (int j = i + 1; j < x.length; j++) 
            {
                if (x[j].length() > x[min].length()) 
                    min = j;
            }
            temp = x[min];
            x[min] = x[i];
            x[i] = temp;
        }
        System.out.println("Sorted strings by length:");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}