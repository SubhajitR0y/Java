import java.util.*;
class CheckUniq
{
    static void main() 
    {
        int num[] = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i=0;i<num.length;i++) 
        {
            System.out.print("Enter integer " + (i+1) + ": ");
            num[i] = scan.nextInt();
        }
        boolean flag = true;
        both:
        for (int i=0;i<num.length;i++) 
        {
            for (int j=i+1;j<num.length;j++)
                if (num[i] == num[j]) 
                {
                    flag = false;
                    break both;
                }
        }
        System.out.println(flag==true?"All numbers are unique.":"Not all numbers are unique.");
    }
}
