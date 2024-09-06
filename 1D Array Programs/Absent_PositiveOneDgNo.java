import java.util.Scanner;
class Absent_PositiveOneDgNo
{
    static void main() 
    {
        int a[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<a.length;i++) 
        {
            System.out.print("Enter integer " + (i + 1) + ": ");
            a[i] = scanner.nextInt();
        }
        int k=1;
        boolean flag = false;
        System.out.print("Single digit positive number which are absent :\t");
        for(int i=0;i<a.length;i++)
        {
            flag=false;
            for(int j=0;j<a.length;j++)
                if(k==a[j])
                    flag=true;
            System.out.print(flag==false?k+",":"");
            k++;
        }
    }
}