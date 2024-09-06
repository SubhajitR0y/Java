import java.util.*;
class NullMatrixCheck
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[5][5];
        boolean flag = true;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print("Enter the element at row "+i+" & position "+j+" : ");
                a[i][j] = sc.nextInt();
                if(a[i][j]!=0)
                    flag = false;
            }
        }
        System.out.println("The array given is : ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        System.out.println(flag?"It is a null matrix.":"It is not a null matrix.");
    }
}
