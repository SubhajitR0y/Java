//finding the sum of single digit and double digit integers
import java.util.*;
class SumOfDigits
{
    static void main() 
    {
        int A[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int sgnDgS=0, dblDgS=0;            
        for (int k=0;k<10;k++) 
        {
            System.out.print("Enter the "+(k+1)+" element : ");
            A[k]=sc.nextInt();
        }
        for(int k=0;k<10;k++)
        {
            if (A[k] >= 10 && A[k] <= 99)
                dblDgS += A[k];
            else if (A[k] >= 0 && A[k] <= 9)
                sgnDgS += A[k];
        }
        System.out.println("Sum of single-digit elements: " + sgnDgS);
        System.out.println("Sum of double-digit elements: " + dblDgS);
    }
}
