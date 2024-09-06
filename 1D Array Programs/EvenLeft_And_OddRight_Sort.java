import java.util.*;
class EvenLeft_And_OddRight_Sort
{
    static void main()
    {
        int a[] = new int[10];
        int b[] = new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            System.out.print("Enter element "+(i+1)+" : ");
            a[i] = scan.nextInt(10);
        }
        System.out.println("The given array is : ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+", ");
        System.out.println();
        int k=-1;
        for(int i=0;i<a.length;i++)
            if(a[i]%2==0)
            {
                k++;
                b[k] = a[i];
            }
        for(int i=0;i<a.length;i++)
            if(a[i]%2!=0)
            {
                k++;
                b[k] = a[i];
            }
        System.out.println("The new sorted array is : ");
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+", ");
    }
}
