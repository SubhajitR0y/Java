import java.util.*;
class PrimeNumber_Sum
{
    static void main()
    {
        int a[] = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) 
        {
            System.out.print("Enter integer " + (i + 1) + ": ");
            a[i] = scan.nextInt();
        }
        System.out.println("The given array is : "); 
        for(int k=0;k<a.length;++k)
             System.out.print(a[k]+", "); 
        System.out.println();
        int c=0,sum=0;
        for(int i=0;i<a.length;i++)
        {
            c=0;
            for(int p=1;p<a[i];p++)
            {
                if(a[i]%p==0)
                    c++;
            }
            if(c==1)
                sum+=a[i];
        }
        System.out.print("The sum of prime numbers is : "+sum); 
    }
}
