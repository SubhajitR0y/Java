import java.util.*;
class SelectionSort_AscendingOrder_1
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
        int temp=0, pmin=0;
        for(int i=0;i<a.length-1;i++)
        {
            pmin=i;
            for(int k=i+1;k<a.length;k++)
            {
                if(a[pmin]<a[k])
                {
                    pmin = k;

                }
            }
                                temp=a[i];
                    a[i]=a[pmin];
                    a[pmin]=temp;
        }
        System.out.println("The array sorted in ascending order is : ");
        for(int k=0;k<a.length;++k)
             System.out.print(a[k]+", "); 
    }
}
