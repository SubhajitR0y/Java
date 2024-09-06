import java.util.*;
class Min_Prime
{
    static void main()
    {
        int num[] = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) 
        {
            System.out.print("Enter integer " + (i + 1) + ": ");
            num[i] = scan.nextInt();
        }
        System.out.println("The given array is : "); 
        for(int k=0;k<num.length;++k)
            System.out.print(num[k]+", "); 
        System.out.println();
        int c,min=0;
        for(int i=0;i<num.length;i++)
        {
            c=0;
            for(int p=1;p<num[i];p++)
            {
                if(num[i]%p==0)
                    c++;
            }
            if(c==1)
            {
                if(num[min]>num[i])
                    min=i;
            }
        }
        System.out.println("The smallest prime number is : "+num[min]+" at position "+min);
    }
}