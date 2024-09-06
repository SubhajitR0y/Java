import java.util.*;
class BubbleSort_AssendingOrder
{
    static void main() 
    {
        int a[] = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i=0;i<a.length;i++) 
        {
            System.out.print("Enter integer " + (i+1) + ": ");
            a[i] = scan.nextInt();
        }
        System.out.print("The given array is : ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+", ");
        System.out.println();
        int temp=0;
        for(int p = 0;p<a.length-1;p++)
        {
            for(int i=0;i<a.length-1-p;i++)
            {
                if(a[i]>a[i+1])
                {
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        System.out.println("The Ascending Array is : ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+", ");
    }
}
