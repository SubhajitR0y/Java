import java.util.*;
class Reverse_Sort
{
    static void main()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array you want to reverse : ");
        int n = scan.nextInt();
        int A[] = new int[n];
        for(int r=0;r<A.length;r++)
        {
            System.out.print("Enter the "+(r+1)+" element of the array : ");
            A[r] = scan.nextInt();
        }
        System.out.println("The given array is : ");
        for(int k=0;k<A.length;k++)
        System.out.print(A[k]+", ");
        System.out.println();
        for(int i=0;i<A.length/2;i++)
        {
            int temp = A[i];
            A[i] = A[A.length-1-i];
            A[A.length-1-i] = temp;
        }
        System.out.println("The reversed array is : ");
        for(int k=0;k<A.length;k++)
        System.out.print(A[k]+", ");
    }
}