import java.util.*;
class SelectionSort_AscendingOrder_2
{
    static void main()
    {
        int a[] = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print("Enter integer " + (i + 1) + ": ");
            a[i] = scan.nextInt();
        }
        System.out.println("The given array is : ");
        for(int k=0;k<a.length;++k)
             System.out.print(a[k]+", "); 
        System.out.println();
        int temp=0;
        for(int i=0;i<a.length-1;i++)
        {
            for(int c=i+1;c<a.length;c++)
            {
                if(a[i]>a[c])
                {
                    temp=a[i];
                    a[i] = a[c];
                    a[c] = temp;
                }
            }
        }
        System.out.println("The array sorted in ascending order is : ");
        for(int k=0;k<a.length;++k)
             System.out.print(a[k]+", "); 
    }
}
