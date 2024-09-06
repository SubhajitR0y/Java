import java.util.*;
class Sum_2D_Array
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[4][4];
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print("Enter the element at row "+i+" & position "+j+" : ");
                a[i][j] = sc.nextInt();
                sum+=a[i][j];
            }
            System.out.println();
        }
        System.out.println("The array given is : ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        System.out.println("The sum of all the elements in the array is : "+sum);
    }
}
