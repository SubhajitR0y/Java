import java.util.*;
class Transpose_2D_Array
{
    static void main()
    {
        int m[][] = new int [3][4];
        int t[][] = new int [m[0].length][m.length];
        Scanner sc = new Scanner(System.in);
        for(int r=0;r<m.length;r++)
        {
            for(int c=0;c<m[0].length;c++)
            {
                System.out.print("Enter the element in the position R"+r+"C"+c+" : ");
                m[r][c] = sc.nextInt();
            }
        }
        System.out.println("\n\nThe given 2D array is : \n");
        for(int r=0;r<m.length;r++)
        {
            for(int c=0;c<m[0].length;c++)
                System.out.print("| "+m[r][c]+" |");
            System.out.println("\n");
        }
        for(int r=0;r<m.length;r++)
        {
            for(int c=0;c<m[0].length;c++)
                t[c][r] = m[r][c];
        }
        System.out.println("\n\nThe transposed 2D array is : \n");
        for(int r=0;r<t.length;r++)
        {
            for(int c=0;c<t[0].length;c++)
                System.out.print("| "+t[r][c]+" |");
            System.out.println("\n");        
        }
    }
}
