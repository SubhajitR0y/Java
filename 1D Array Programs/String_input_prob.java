import java.util.*;
class String_input_prob
{
    static void main() 
    {
        Scanner sc = new Scanner(System.in);
        int e1[] = new int[100];
        int e2[] = new int[100];
        String name[] = new String[100];
        for (int i = 0; i < e1.length; i++) {
            System.out.print("Enter the name of the student : ");
            name[i] = sc.nextLine();
            System.out.print("Enter the marks in English 1 : ");
            e1[i] = sc.nextInt();
            System.out.print("Enter the marks in English 2 : ");
            e2[i] = sc.nextInt();
            System.out.println();
            sc.nextLine();
        }
        System.out.println();
        for (int i = 0; i < e1.length; i++)
            System.out.println("The average marks of " + name[i] + " in Englsh : " + ((e1[i] + e2[i]) / 2.0));
    }
}
