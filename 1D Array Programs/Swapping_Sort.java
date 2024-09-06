import java.util.Scanner;
class Swapping_Sort
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
        for(int k=0;k<num.length;++k)
             System.out.print(num[k]+", "); 
        System.out.println();
        for (int i = 0; i < 10; i += 2) 
        {
            if (i + 1 < 10) 
            {
                int temp = num[i];
                num[i] = num[i+1];
                num[i+1]=temp;
            }
        }
        System.out.println("The integers after swapping are:");
        for(int k=0;k<num.length;++k)
            System.out.print(num[k]+", ");
    }
}
