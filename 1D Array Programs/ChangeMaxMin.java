import java.util.*;
class ChangeMaxMin
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[5][5];
        int maxr=0,maxc=0, minr=maxr, minc=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print("Enter the element at row "+i+" & position "+j+" : ");
                a[i][j] = sc.nextInt();
                if(a[maxr][maxc]<a[i][j])
                {
                    maxr = i;
                    maxc = j;
                }
                if(a[minr][minc]>a[i][j])
                {
                    minr = i;
                    minc = j;
                }
            }
        }
        System.out.println("The given array is : ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        int temp = a[maxr][maxc];
        a[maxr][maxc] = a[minr][minc];
        a[minr][minc] = temp;
        System.out.println("The sorted array is : ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}
